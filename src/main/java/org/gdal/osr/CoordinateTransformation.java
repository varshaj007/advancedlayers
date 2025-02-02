/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.gdal.osr;

public class CoordinateTransformation {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CoordinateTransformation(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }
  
  public static long getCPtr(CoordinateTransformation obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        osrJNI.delete_CoordinateTransformation(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public double[] TransformPoint(double x, double y, double z) {
    double[] ret = new double[3];
    TransformPoint(ret, x, y, z);
    return ret;
  }

  public double[] TransformPoint(double x, double y) {
    return TransformPoint(x, y, 0);
  }

  /* New in GDAL 1.10 */
  public static CoordinateTransformation CreateCoordinateTransformation(SpatialReference src, SpatialReference dst)
  {
      return osr.CreateCoordinateTransformation(src, dst);
  }

  public CoordinateTransformation(SpatialReference src, SpatialReference dst) {
    this(osrJNI.new_CoordinateTransformation(SpatialReference.getCPtr(src), src, SpatialReference.getCPtr(dst), dst), true);
  }

  public void TransformPoint(double[] inout) {
    osrJNI.CoordinateTransformation_TransformPoint__SWIG_0(swigCPtr, this, inout);
  }

  public void TransformPoint(double[] argout, double x, double y, double z) {
    osrJNI.CoordinateTransformation_TransformPoint__SWIG_1(swigCPtr, this, argout, x, y, z);
  }

  public void TransformPoint(double[] argout, double x, double y) {
    osrJNI.CoordinateTransformation_TransformPoint__SWIG_2(swigCPtr, this, argout, x, y);
  }

  public void TransformPoints(double[][] nCount) {
    osrJNI.CoordinateTransformation_TransformPoints(swigCPtr, this, nCount);
  }

}
