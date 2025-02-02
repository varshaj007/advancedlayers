/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.gdal.ogr;

import org.gdal.osr.SpatialReference;

public class GeomFieldDefn {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected GeomFieldDefn(long cPtr, boolean cMemoryOwn) {
    if (cPtr == 0)
        throw new RuntimeException();
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }
  
  protected static long getCPtr(GeomFieldDefn obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ogrJNI.delete_GeomFieldDefn(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  private Object parentReference;

  protected static long getCPtrAndDisown(GeomFieldDefn obj) {
    if (obj != null)
    {
        obj.swigCMemOwn= false;
        obj.parentReference = null;
    }
    return getCPtr(obj);
  }

  /* Ensure that the GC doesn't collect any parent instance set from Java */
  protected void addReference(Object reference) {
    parentReference = reference;
  }

  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof GeomFieldDefn)
      equal = (((GeomFieldDefn)obj).swigCPtr == this.swigCPtr);
    return equal;
  }

  public int hashCode() {
     return (int)swigCPtr;
  }


  public GeomFieldDefn(String name_null_ok, int field_type) {
    this(ogrJNI.new_GeomFieldDefn__SWIG_0(name_null_ok, field_type), true);
  }

  public GeomFieldDefn(String name_null_ok) {
    this(ogrJNI.new_GeomFieldDefn__SWIG_1(name_null_ok), true);
  }

  public GeomFieldDefn() {
    this(ogrJNI.new_GeomFieldDefn__SWIG_2(), true);
  }

  public String GetName() {
    return ogrJNI.GeomFieldDefn_GetName(swigCPtr, this);
  }

  public String GetNameRef() {
    return ogrJNI.GeomFieldDefn_GetNameRef(swigCPtr, this);
  }

  public void SetName(String name) {
    ogrJNI.GeomFieldDefn_SetName(swigCPtr, this, name);
  }

  public int GetFieldType() {
    return ogrJNI.GeomFieldDefn_GetFieldType(swigCPtr, this);
  }

  public void SetType(int type) {
    ogrJNI.GeomFieldDefn_SetType(swigCPtr, this, type);
  }

  public SpatialReference GetSpatialRef() {
    long cPtr = ogrJNI.GeomFieldDefn_GetSpatialRef(swigCPtr, this);
    return (cPtr == 0) ? null : new SpatialReference(cPtr, true);
  }

  public void SetSpatialRef(SpatialReference srs) {
    ogrJNI.GeomFieldDefn_SetSpatialRef(swigCPtr, this, SpatialReference.getCPtr(srs), srs);
  }

  public int IsIgnored() {
    return ogrJNI.GeomFieldDefn_IsIgnored(swigCPtr, this);
  }

  public void SetIgnored(int bIgnored) {
    ogrJNI.GeomFieldDefn_SetIgnored(swigCPtr, this, bIgnored);
  }

}
