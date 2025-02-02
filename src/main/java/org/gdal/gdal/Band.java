/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.gdal.gdal;

import org.gdal.gdalconst.gdalconstConstants;

public class Band extends MajorObject {
  private long swigCPtr;

  protected Band(long cPtr, boolean cMemoryOwn) {
    super(gdalJNI.Band_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Band obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
    super.delete();
  }


  // Preferred name to match C++ API
  public int GetXSize() { return getXSize(); }

  // Preferred name to match C++ API
  public int GetYSize() { return getYSize(); }

  // Preferred name to match C++ API
  public int GetRasterDataType() { return getDataType(); }

  public int GetBlockXSize()
  {
      int[] anBlockXSize = new int[1];
      int[] anBlockYSize = new int[1];
      GetBlockSize(anBlockXSize, anBlockYSize);
      return anBlockXSize[0];
  }

  public int GetBlockYSize()
  {
      int[] anBlockXSize = new int[1];
      int[] anBlockYSize = new int[1];
      GetBlockSize(anBlockXSize, anBlockYSize);
      return anBlockYSize[0];
  }

  public int Checksum() {
    return Checksum(0, 0, getXSize(), getYSize());
  }

  public int GetStatistics(boolean approx_ok, boolean force, double[] min, double[] max, double[] mean, double[] stddev) {
    return GetStatistics((approx_ok) ? 1 : 0, (force) ? 1 : 0, min, max, mean, stddev);
  }

   public int ReadRaster_Direct(int xoff, int yoff, int xsize, int ysize,
                                int buf_xsize, int buf_ysize, java.nio.ByteBuffer nioBuffer) {
       return ReadRaster_Direct(xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, gdalconstConstants.GDT_Byte, nioBuffer);
   }

   public int ReadRaster_Direct(int xoff, int yoff, int xsize, int ysize,
                                java.nio.ByteBuffer nioBuffer) {
       return ReadRaster_Direct(xoff, yoff, xsize, ysize, xsize, ysize, gdalconstConstants.GDT_Byte, nioBuffer);
   }

   public java.nio.ByteBuffer ReadRaster_Direct(int xoff, int yoff, int xsize, int ysize,
                                                int buf_xsize, int buf_ysize, int buf_type)
   {
       long buf_size = buf_xsize * buf_ysize * (gdal.GetDataTypeSize(buf_type) / 8);
       if ((int)buf_size != buf_size)
               throw new OutOfMemoryError();
       java.nio.ByteBuffer nioBuffer = java.nio.ByteBuffer.allocateDirect((int)buf_size);
       int ret = ReadRaster_Direct(xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, nioBuffer);
       if (ret == gdalconstConstants.CE_None)
               return nioBuffer;
       else
               return null;
   }

   public java.nio.ByteBuffer ReadRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_type)
   {
       return ReadRaster_Direct(xoff, yoff, xsize, ysize, xsize, ysize, buf_type);
   }

   public java.nio.ByteBuffer ReadRaster_Direct(int xoff, int yoff, int xsize, int ysize)
   {
       return ReadRaster_Direct(xoff, yoff, xsize, ysize, xsize, ysize, gdalconstConstants.GDT_Byte);
   }

   public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_type, byte[] array) {
       return ReadRaster(xoff, yoff, xsize, ysize, xsize, ysize, buf_type, array);
   }

   public int ReadRaster(int xoff, int yoff, int xsize, int ysize, byte[] array) {
       return ReadRaster(xoff, yoff, xsize, ysize, xsize, ysize, gdalconstConstants.GDT_Byte, array);
   }
   
   public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_type, short[] array) {
       return ReadRaster(xoff, yoff, xsize, ysize, xsize, ysize, buf_type, array);
   }

   public int ReadRaster(int xoff, int yoff, int xsize, int ysize, short[] array) {
       return ReadRaster(xoff, yoff, xsize, ysize, xsize, ysize, gdalconstConstants.GDT_Int16, array);
   }
   
   public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_type, int[] array) {
       return ReadRaster(xoff, yoff, xsize, ysize, xsize, ysize, buf_type, array);
   }
   
   public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int[] array) {
       return ReadRaster(xoff, yoff, xsize, ysize, xsize, ysize, gdalconstConstants.GDT_Int32, array);
   }
   
   public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_type, float[] array) {
       return ReadRaster(xoff, yoff, xsize, ysize, xsize, ysize, buf_type, array);
   }
   
   public int ReadRaster(int xoff, int yoff, int xsize, int ysize, float[] array) {
       return ReadRaster(xoff, yoff, xsize, ysize, xsize, ysize, gdalconstConstants.GDT_Float32, array);
   }
   
   public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_type, double[] array) {
       return ReadRaster(xoff, yoff, xsize, ysize, xsize, ysize, buf_type, array);
   }
   
   public int ReadRaster(int xoff, int yoff, int xsize, int ysize, double[] array) {
       return ReadRaster(xoff, yoff, xsize, ysize, xsize, ysize, gdalconstConstants.GDT_Float64, array);
   }
   
   public int WriteRaster_Direct(int xoff, int yoff, int xsize, int ysize,
                                int buf_xsize, int buf_ysize, java.nio.ByteBuffer nioBuffer) {
       return WriteRaster_Direct(xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, gdalconstConstants.GDT_Byte, nioBuffer);
   }

   public int WriteRaster_Direct(int xoff, int yoff, int xsize, int ysize,
                                 int buf_type, java.nio.ByteBuffer nioBuffer) {
       return WriteRaster_Direct(xoff, yoff, xsize, ysize, xsize, ysize, buf_type, nioBuffer);
   }

   public int WriteRaster_Direct(int xoff, int yoff, int xsize, int ysize,
                                 java.nio.ByteBuffer nioBuffer) {
       return WriteRaster_Direct(xoff, yoff, xsize, ysize, xsize, ysize, gdalconstConstants.GDT_Byte, nioBuffer);
   }

   public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_type, byte[] array) {
       return WriteRaster(xoff, yoff, xsize, ysize, xsize, ysize, buf_type, array);
   }

   public int WriteRaster(int xoff, int yoff, int xsize, int ysize, byte[] array) {
       return WriteRaster(xoff, yoff, xsize, ysize, xsize, ysize, gdalconstConstants.GDT_Byte, array);
   }
   
   public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_type, short[] array) {
       return WriteRaster(xoff, yoff, xsize, ysize, xsize, ysize, buf_type, array);
   }

   public int WriteRaster(int xoff, int yoff, int xsize, int ysize, short[] array) {
       return WriteRaster(xoff, yoff, xsize, ysize, xsize, ysize, gdalconstConstants.GDT_Int16, array);
   }
   
   public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_type, int[] array) {
       return WriteRaster(xoff, yoff, xsize, ysize, xsize, ysize, buf_type, array);
   }
   
   public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int[] array) {
       return WriteRaster(xoff, yoff, xsize, ysize, xsize, ysize, gdalconstConstants.GDT_Int32, array);
   }
   
   public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_type, float[] array) {
       return WriteRaster(xoff, yoff, xsize, ysize, xsize, ysize, buf_type, array);
   }
   
   public int WriteRaster(int xoff, int yoff, int xsize, int ysize, float[] array) {
       return WriteRaster(xoff, yoff, xsize, ysize, xsize, ysize, gdalconstConstants.GDT_Float32, array);
   }
   
   public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_type, double[] array) {
       return WriteRaster(xoff, yoff, xsize, ysize, xsize, ysize, buf_type, array);
   }
   
   public int WriteRaster(int xoff, int yoff, int xsize, int ysize, double[] array) {
       return WriteRaster(xoff, yoff, xsize, ysize, xsize, ysize, gdalconstConstants.GDT_Float64, array);
   }

  public int getXSize() {
    return gdalJNI.Band_XSize_get(swigCPtr, this);
  }

  public int getYSize() {
    return gdalJNI.Band_YSize_get(swigCPtr, this);
  }

  public int getDataType() {
    return gdalJNI.Band_DataType_get(swigCPtr, this);
  }

  public int GetBand() {
    return gdalJNI.Band_GetBand(swigCPtr, this);
  }

  public void GetBlockSize(int[] pnBlockXSize, int[] pnBlockYSize) {
    gdalJNI.Band_GetBlockSize(swigCPtr, this, pnBlockXSize, pnBlockYSize);
  }

  public int GetColorInterpretation() {
    return gdalJNI.Band_GetColorInterpretation(swigCPtr, this);
  }

  public int GetRasterColorInterpretation() {
    return gdalJNI.Band_GetRasterColorInterpretation(swigCPtr, this);
  }

  public int SetColorInterpretation(int val) {
    return gdalJNI.Band_SetColorInterpretation(swigCPtr, this, val);
  }

  public int SetRasterColorInterpretation(int val) {
    return gdalJNI.Band_SetRasterColorInterpretation(swigCPtr, this, val);
  }

  public void GetNoDataValue(Double[] val) {
    gdalJNI.Band_GetNoDataValue(swigCPtr, this, val);
  }

  public int SetNoDataValue(double d) {
    return gdalJNI.Band_SetNoDataValue(swigCPtr, this, d);
  }

  public String GetUnitType() {
    return gdalJNI.Band_GetUnitType(swigCPtr, this);
  }

  public int SetUnitType(String val) {
    return gdalJNI.Band_SetUnitType(swigCPtr, this, val);
  }

  public java.util.Vector GetRasterCategoryNames() {
    return gdalJNI.Band_GetRasterCategoryNames(swigCPtr, this);
  }

  public int SetRasterCategoryNames(java.util.Vector names) {
    return gdalJNI.Band_SetRasterCategoryNames(swigCPtr, this, names);
  }

  public void GetMinimum(Double[] val) {
    gdalJNI.Band_GetMinimum(swigCPtr, this, val);
  }

  public void GetMaximum(Double[] val) {
    gdalJNI.Band_GetMaximum(swigCPtr, this, val);
  }

  public void GetOffset(Double[] val) {
    gdalJNI.Band_GetOffset(swigCPtr, this, val);
  }

  public void GetScale(Double[] val) {
    gdalJNI.Band_GetScale(swigCPtr, this, val);
  }

  public int SetOffset(double val) {
    return gdalJNI.Band_SetOffset(swigCPtr, this, val);
  }

  public int SetScale(double val) {
    return gdalJNI.Band_SetScale(swigCPtr, this, val);
  }

  public int GetStatistics(int approx_ok, int force, double[] min, double[] max, double[] mean, double[] stddev) {
    return gdalJNI.Band_GetStatistics(swigCPtr, this, approx_ok, force, min, max, mean, stddev);
  }

  public int ComputeStatistics(boolean approx_ok, double[] min, double[] max, double[] mean, double[] stddev, ProgressCallback callback) {
    return gdalJNI.Band_ComputeStatistics__SWIG_0(swigCPtr, this, approx_ok, min, max, mean, stddev, callback);
  }

  public int ComputeStatistics(boolean approx_ok, double[] min, double[] max, double[] mean, double[] stddev) {
    return gdalJNI.Band_ComputeStatistics__SWIG_2(swigCPtr, this, approx_ok, min, max, mean, stddev);
  }

  public int ComputeStatistics(boolean approx_ok, double[] min, double[] max, double[] mean) {
    return gdalJNI.Band_ComputeStatistics__SWIG_3(swigCPtr, this, approx_ok, min, max, mean);
  }

  public int ComputeStatistics(boolean approx_ok, double[] min, double[] max) {
    return gdalJNI.Band_ComputeStatistics__SWIG_4(swigCPtr, this, approx_ok, min, max);
  }

  public int ComputeStatistics(boolean approx_ok, double[] min) {
    return gdalJNI.Band_ComputeStatistics__SWIG_5(swigCPtr, this, approx_ok, min);
  }

  public int ComputeStatistics(boolean approx_ok) {
    return gdalJNI.Band_ComputeStatistics__SWIG_6(swigCPtr, this, approx_ok);
  }

  public int SetStatistics(double min, double max, double mean, double stddev) {
    return gdalJNI.Band_SetStatistics(swigCPtr, this, min, max, mean, stddev);
  }

  public int GetOverviewCount() {
    return gdalJNI.Band_GetOverviewCount(swigCPtr, this);
  }

  public Band GetOverview(int i) {
    long cPtr = gdalJNI.Band_GetOverview(swigCPtr, this, i);
    Band ret = null;
    if (cPtr != 0) {
      ret = new Band(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public int Checksum(int xoff, int yoff, int xsize, int ysize) {
    return gdalJNI.Band_Checksum(swigCPtr, this, xoff, yoff, xsize, ysize);
  }

  public void ComputeRasterMinMax(double[] argout, int approx_ok) {
    gdalJNI.Band_ComputeRasterMinMax__SWIG_0(swigCPtr, this, argout, approx_ok);
  }

  public void ComputeRasterMinMax(double[] argout) {
    gdalJNI.Band_ComputeRasterMinMax__SWIG_1(swigCPtr, this, argout);
  }

  public void ComputeBandStats(double[] argout, int samplestep) {
    gdalJNI.Band_ComputeBandStats__SWIG_0(swigCPtr, this, argout, samplestep);
  }

  public void ComputeBandStats(double[] argout) {
    gdalJNI.Band_ComputeBandStats__SWIG_1(swigCPtr, this, argout);
  }

  public int Fill(double real_fill, double imag_fill) {
    return gdalJNI.Band_Fill__SWIG_0(swigCPtr, this, real_fill, imag_fill);
  }

  public int Fill(double real_fill) {
    return gdalJNI.Band_Fill__SWIG_1(swigCPtr, this, real_fill);
  }

  public void FlushCache() {
    gdalJNI.Band_FlushCache(swigCPtr, this);
  }

  public ColorTable GetRasterColorTable() {
    long cPtr = gdalJNI.Band_GetRasterColorTable(swigCPtr, this);
    ColorTable ret = null;
    if (cPtr != 0) {
      ret = new ColorTable(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public ColorTable GetColorTable() {
    long cPtr = gdalJNI.Band_GetColorTable(swigCPtr, this);
    ColorTable ret = null;
    if (cPtr != 0) {
      ret = new ColorTable(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public int SetRasterColorTable(ColorTable arg) {
    return gdalJNI.Band_SetRasterColorTable(swigCPtr, this, ColorTable.getCPtr(arg), arg);
  }

  public int SetColorTable(ColorTable arg) {
    return gdalJNI.Band_SetColorTable(swigCPtr, this, ColorTable.getCPtr(arg), arg);
  }

  public RasterAttributeTable GetDefaultRAT() {
    long cPtr = gdalJNI.Band_GetDefaultRAT(swigCPtr, this);
    return (cPtr == 0) ? null : new RasterAttributeTable(cPtr, false);
  }

  public int SetDefaultRAT(RasterAttributeTable table) {
    return gdalJNI.Band_SetDefaultRAT(swigCPtr, this, RasterAttributeTable.getCPtr(table), table);
  }

  public Band GetMaskBand() {
    long cPtr = gdalJNI.Band_GetMaskBand(swigCPtr, this);
    Band ret = null;
    if (cPtr != 0) {
      ret = new Band(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public int GetMaskFlags() {
    return gdalJNI.Band_GetMaskFlags(swigCPtr, this);
  }

  public int CreateMaskBand(int nFlags) {
    return gdalJNI.Band_CreateMaskBand(swigCPtr, this, nFlags);
  }

  public int SetDefaultHistogram(double min, double max, int[] buckets_in) {
    return gdalJNI.Band_SetDefaultHistogram(swigCPtr, this, min, max, buckets_in);
  }

  public boolean HasArbitraryOverviews() {
    return gdalJNI.Band_HasArbitraryOverviews(swigCPtr, this);
  }

  public java.util.Vector GetCategoryNames() {
    return gdalJNI.Band_GetCategoryNames(swigCPtr, this);
  }

  public int SetCategoryNames(java.util.Vector papszCategoryNames) {
    return gdalJNI.Band_SetCategoryNames(swigCPtr, this, papszCategoryNames);
  }

  public int ReadRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, java.nio.ByteBuffer nioBuffer, int nPixelSpace, int nLineSpace) {
    return gdalJNI.Band_ReadRaster_Direct__SWIG_0(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, nioBuffer, nPixelSpace, nLineSpace);
  }

  public int ReadRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, java.nio.ByteBuffer nioBuffer, int nPixelSpace) {
    return gdalJNI.Band_ReadRaster_Direct__SWIG_1(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, nioBuffer, nPixelSpace);
  }

  public int ReadRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, java.nio.ByteBuffer nioBuffer) {
    return gdalJNI.Band_ReadRaster_Direct__SWIG_2(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, nioBuffer);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, byte[] regularArrayOut, int nPixelSpace, int nLineSpace) {
    return gdalJNI.Band_ReadRaster__SWIG_0(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, nPixelSpace, nLineSpace);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, byte[] regularArrayOut, int nPixelSpace) {
    return gdalJNI.Band_ReadRaster__SWIG_1(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, nPixelSpace);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, byte[] regularArrayOut) {
    return gdalJNI.Band_ReadRaster__SWIG_2(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, short[] regularArrayOut, int nPixelSpace, int nLineSpace) {
    return gdalJNI.Band_ReadRaster__SWIG_3(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, nPixelSpace, nLineSpace);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, short[] regularArrayOut, int nPixelSpace) {
    return gdalJNI.Band_ReadRaster__SWIG_4(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, nPixelSpace);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, short[] regularArrayOut) {
    return gdalJNI.Band_ReadRaster__SWIG_5(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, int[] regularArrayOut, int nPixelSpace, int nLineSpace) {
    return gdalJNI.Band_ReadRaster__SWIG_6(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, nPixelSpace, nLineSpace);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, int[] regularArrayOut, int nPixelSpace) {
    return gdalJNI.Band_ReadRaster__SWIG_7(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, nPixelSpace);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, int[] regularArrayOut) {
    return gdalJNI.Band_ReadRaster__SWIG_8(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, float[] regularArrayOut, int nPixelSpace, int nLineSpace) {
    return gdalJNI.Band_ReadRaster__SWIG_9(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, nPixelSpace, nLineSpace);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, float[] regularArrayOut, int nPixelSpace) {
    return gdalJNI.Band_ReadRaster__SWIG_10(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, nPixelSpace);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, float[] regularArrayOut) {
    return gdalJNI.Band_ReadRaster__SWIG_11(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, double[] regularArrayOut, int nPixelSpace, int nLineSpace) {
    return gdalJNI.Band_ReadRaster__SWIG_12(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, nPixelSpace, nLineSpace);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, double[] regularArrayOut, int nPixelSpace) {
    return gdalJNI.Band_ReadRaster__SWIG_13(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut, nPixelSpace);
  }

  public int ReadRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, double[] regularArrayOut) {
    return gdalJNI.Band_ReadRaster__SWIG_14(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayOut);
  }

  public int WriteRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, java.nio.ByteBuffer nioBuffer, int nPixelSpace, int nLineSpace) {
    return gdalJNI.Band_WriteRaster_Direct__SWIG_0(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, nioBuffer, nPixelSpace, nLineSpace);
  }

  public int WriteRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, java.nio.ByteBuffer nioBuffer, int nPixelSpace) {
    return gdalJNI.Band_WriteRaster_Direct__SWIG_1(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, nioBuffer, nPixelSpace);
  }

  public int WriteRaster_Direct(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, java.nio.ByteBuffer nioBuffer) {
    return gdalJNI.Band_WriteRaster_Direct__SWIG_2(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, nioBuffer);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, byte[] regularArrayIn, int nPixelSpace, int nLineSpace) {
    return gdalJNI.Band_WriteRaster__SWIG_0(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, nPixelSpace, nLineSpace);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, byte[] regularArrayIn, int nPixelSpace) {
    return gdalJNI.Band_WriteRaster__SWIG_1(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, nPixelSpace);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, byte[] regularArrayIn) {
    return gdalJNI.Band_WriteRaster__SWIG_2(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, short[] regularArrayIn, int nPixelSpace, int nLineSpace) {
    return gdalJNI.Band_WriteRaster__SWIG_3(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, nPixelSpace, nLineSpace);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, short[] regularArrayIn, int nPixelSpace) {
    return gdalJNI.Band_WriteRaster__SWIG_4(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, nPixelSpace);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, short[] regularArrayIn) {
    return gdalJNI.Band_WriteRaster__SWIG_5(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, int[] regularArrayIn, int nPixelSpace, int nLineSpace) {
    return gdalJNI.Band_WriteRaster__SWIG_6(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, nPixelSpace, nLineSpace);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, int[] regularArrayIn, int nPixelSpace) {
    return gdalJNI.Band_WriteRaster__SWIG_7(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, nPixelSpace);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, int[] regularArrayIn) {
    return gdalJNI.Band_WriteRaster__SWIG_8(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, float[] regularArrayIn, int nPixelSpace, int nLineSpace) {
    return gdalJNI.Band_WriteRaster__SWIG_9(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, nPixelSpace, nLineSpace);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, float[] regularArrayIn, int nPixelSpace) {
    return gdalJNI.Band_WriteRaster__SWIG_10(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, nPixelSpace);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, float[] regularArrayIn) {
    return gdalJNI.Band_WriteRaster__SWIG_11(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, double[] regularArrayIn, int nPixelSpace, int nLineSpace) {
    return gdalJNI.Band_WriteRaster__SWIG_12(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, nPixelSpace, nLineSpace);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, double[] regularArrayIn, int nPixelSpace) {
    return gdalJNI.Band_WriteRaster__SWIG_13(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn, nPixelSpace);
  }

  public int WriteRaster(int xoff, int yoff, int xsize, int ysize, int buf_xsize, int buf_ysize, int buf_type, double[] regularArrayIn) {
    return gdalJNI.Band_WriteRaster__SWIG_14(swigCPtr, this, xoff, yoff, xsize, ysize, buf_xsize, buf_ysize, buf_type, regularArrayIn);
  }

  public int ReadBlock_Direct(int nXBlockOff, int nYBlockOff, java.nio.ByteBuffer nioBuffer) {
    return gdalJNI.Band_ReadBlock_Direct(swigCPtr, this, nXBlockOff, nYBlockOff, nioBuffer);
  }

  public int WriteBlock_Direct(int nXBlockOff, int nYBlockOff, java.nio.ByteBuffer nioBuffer) {
    return gdalJNI.Band_WriteBlock_Direct(swigCPtr, this, nXBlockOff, nYBlockOff, nioBuffer);
  }

  public int GetHistogram(double min, double max, int[] buckets, boolean include_out_of_range, boolean approx_ok, ProgressCallback callback) {
    return gdalJNI.Band_GetHistogram__SWIG_0(swigCPtr, this, min, max, buckets, include_out_of_range, approx_ok, callback);
  }

  public int GetHistogram(double min, double max, int[] buckets, boolean include_out_of_range, boolean approx_ok) {
    return gdalJNI.Band_GetHistogram__SWIG_1(swigCPtr, this, min, max, buckets, include_out_of_range, approx_ok);
  }

  public int GetHistogram(double min, double max, int[] buckets) {
    return gdalJNI.Band_GetHistogram__SWIG_2(swigCPtr, this, min, max, buckets);
  }

  public int GetHistogram(int[] buckets) {
    return gdalJNI.Band_GetHistogram__SWIG_3(swigCPtr, this, buckets);
  }

  public int GetDefaultHistogram(double[] min_ret, double[] max_ret, int[][] buckets_ret, boolean force, ProgressCallback callback) {
    return gdalJNI.Band_GetDefaultHistogram__SWIG_0(swigCPtr, this, min_ret, max_ret, buckets_ret, force, callback);
  }

  public int GetDefaultHistogram(double[] min_ret, double[] max_ret, int[][] buckets_ret, boolean force) {
    return gdalJNI.Band_GetDefaultHistogram__SWIG_2(swigCPtr, this, min_ret, max_ret, buckets_ret, force);
  }

  public int GetDefaultHistogram(double[] min_ret, double[] max_ret, int[][] buckets_ret) {
    return gdalJNI.Band_GetDefaultHistogram__SWIG_3(swigCPtr, this, min_ret, max_ret, buckets_ret);
  }

}
