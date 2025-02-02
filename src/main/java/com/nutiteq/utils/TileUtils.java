package com.nutiteq.utils;

import com.nutiteq.components.Bounds;
import com.nutiteq.components.Envelope;
import com.nutiteq.components.MapPos;
import com.nutiteq.components.MapTile;
import com.nutiteq.log.Log;
import com.nutiteq.projections.Projection;

public class TileUtils {
    
    private static final double TILESIZE = 256;
    private static final double initialResolution = 2.0f * Math.PI * 6378137.0f / TILESIZE;
    private static final double originShift = 2.0f * Math.PI * 6378137.0f / 2.0f;

    // following is from
    // http://code.google.com/p/gmap-tile-generator/source/browse/trunk/gmaps-tile-creator/src/gov/ca/maps/tile/geom/GlobalMercator.java?r=15
    /**
     * Returns tile for given Mercator coordinates
     * 
     * @return
     */
    public static MapPos MetersToTile(MapPos mp, int zoom) {
        int[] p = MetersToPixels(mp.x, mp.y, zoom);
        return PixelsToTile(p[0], p[1], zoom);
    }

    /**
     * Returns a tile covering region in given pixel coordinates
     * 
     * @param px
     * @param py
     * @param zoom 
     * @return
     */
    public static MapPos PixelsToTile(int px, int py, int zoom) {
        int tx = (int) Math.ceil(px / ((double) TILESIZE) - 1);
        int ty = (int) Math.ceil(py / ((double) TILESIZE) - 1);
        return new MapPos(tx, (1<<(zoom))-1-ty);
    }

    /**
     * Converts EPSG:900913 to pyramid pixel coordinates in given zoom level
     * 
     * @param mx
     * @param my
     * @param zoom
     * @return
     */
    public static int[] MetersToPixels(double mx, double my, int zoom) {
        double res = Resolution(zoom);
        int px = (int) Math.round((mx + originShift) / res);
        int py = (int) Math.round((my + originShift) / res);
        return new int[] { px, py };
    }

    /**
     * Resolution (meters/pixel) for given zoom level (measured at Equator)
     * 
     * @return
     */
    public static double Resolution(int zoom) {
        // return (2 * Math.PI * 6378137) / (this.tileSize * 2**zoom)
        return initialResolution / Math.pow(2, zoom);
    }
    
    /**
     * Returns bounds of the given tile in EPSG:900913 (EPSG:3857) coordinates
     * 
     * @param tx
     * @param ty (bottom-top)
     * @param zoom
     * @return
     * @deprecated use TileBounds with projection instead
     */
    public static Envelope TileBounds(int tx, int ty, int zoom) {
        double[] min = PixelsToMeters(tx * TILESIZE, ty * TILESIZE, zoom);
        double minx = min[0], miny = min[1];
        double[] max = PixelsToMeters((tx + 1) * TILESIZE, (ty + 1) * TILESIZE, zoom);
        double maxx = max[0], maxy = max[1];
            
        return new Envelope( minx, maxx, miny, maxy);
    }
    
    /**
     *  Get bounds of tile
     * @param tx tile x (left-right)
     * @param ty tile y (top-bottom)
     * @param zoom zoom (0 = world)
     * @param proj
     * @return bounds, in given projection
     */
    public static Envelope TileBounds(int tx, int ty, int zoom, Projection proj) {

        Bounds bounds = proj.getBounds();

        int xCount = Math.max(1, (int) Math.round(bounds.getWidth() / bounds.getHeight()));
        int yCount = Math.max(1, (int) Math.round(bounds.getHeight() / bounds.getWidth()));

        double resx = bounds.getWidth() / xCount / (TILESIZE * (double) (1<<(zoom)));
        double resy = bounds.getHeight() / yCount / (TILESIZE * (double) (1<<(zoom)));

        double minx = ((double) tx + 0) * TILESIZE * resx + bounds.left;
        double maxx = ((double) tx + 1) * TILESIZE * resx + bounds.left;
        double miny = -((double) ty + 1) * TILESIZE * resy + bounds.top;
        double maxy = -((double) ty + 0) * TILESIZE * resy + bounds.top;
        
        Envelope env = new Envelope( minx, maxx, miny, maxy);
        Log.debug("Tile: x=" + tx + ",y=" + ty + ",zoom=" + zoom + ",env=" + env);
        
        return env;
    }

    
    /**
     * Converts XY point from Spherical Mercator EPSG:900913 to lat/lon in WGS84
     * Datum
     * 
     * @return
     */
    public static double[] MetersToLatLon(double mx, double my) {

        double lon = (mx / originShift) * 180.0;
        double lat = (my / originShift) * 180.0;

        lat = 180 / Math.PI * (2 * Math.atan(Math.exp(lat * Math.PI / 180.0)) - Math.PI / 2.0);
        return new double[] { lat, lon };
    }
    
    /**
     * Converts pixel coordinates in given zoom level of pyramid to EPSG:900913
     * 
     * @return
     */
    public static double[] PixelsToMeters(double px, double py, int zoom) {
        double res = Resolution(zoom);
        double mx = px * res - originShift;
        double my = originShift - (py * res);
        return new double[] { mx, my };
    }

    /**
     * Calculate projection bounds matching 2 tile pixels
     * 
     * @param tile1 first tile info, id is not used
     * @param tile1x pixel x coordinate in the first tile 
     * @param tile1y pixel y coordinate in the first tile
     * @param projPos1 projection position corresponding to the first tile pixel
     * @param tile2 second tile info, id is not used
     * @param tile2x pixel x coordinate in the second tile
     * @param tile2y pixel y coordinate in the second tile
     * @param projPos2 projection position corresponding to the second tile pixel
     * @return projection bounds
     */
    public static Bounds ProjectionBounds(MapTile tile1, float tile1x, float tile1y, MapPos projPos1, MapTile tile2, float tile2x, float tile2y, MapPos projPos2) {
        float screen1x = (tile1x / 256.0f + tile1.x) / (1 << tile1.zoom);
        float screen1y = (tile1y / 256.0f + tile1.y) / (1 << tile1.zoom);
        float screen2x = (tile2x / 256.0f + tile2.x) / (1 << tile2.zoom);
        float screen2y = (tile2y / 256.0f + tile2.y) / (1 << tile2.zoom);

        double c1 = (projPos1.x - projPos2.x) / (screen1x - screen2x);
        double o1 = projPos1.x - c1 * screen1x; 
        double c2 = (projPos1.y - projPos2.y) / (screen1y - screen2y);
        double o2 = projPos1.y - c2 * screen1y;

        return new Bounds(o1, o2 + c2, o1 + c1, o2);
    }
    
}
