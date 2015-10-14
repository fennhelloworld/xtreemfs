/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.xtreemfs.common.libxtreemfs.jni.generated;

public class StringListIterator implements java.util.Iterator<String> {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected StringListIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StringListIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        xtreemfs_jniJNI.delete_StringListIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void remove() throws UnsupportedOperationException {
    throw new UnsupportedOperationException();
  }

  public String next() throws java.util.NoSuchElementException {
    if (!hasNext()) {
      throw new java.util.NoSuchElementException();
    }

    return nextImpl();
  }

  public StringListIterator(StringList list) {
    this(xtreemfs_jniJNI.new_StringListIterator(StringList.getCPtr(list), list), true);
  }

  public boolean hasNext() {
    return xtreemfs_jniJNI.StringListIterator_hasNext(swigCPtr, this);
  }

  private String nextImpl() {
    return xtreemfs_jniJNI.StringListIterator_nextImpl(swigCPtr, this);
  }

}
