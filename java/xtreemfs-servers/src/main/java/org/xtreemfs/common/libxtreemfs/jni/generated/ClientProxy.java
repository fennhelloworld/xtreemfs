/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.xtreemfs.common.libxtreemfs.jni.generated;

public class ClientProxy {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ClientProxy(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ClientProxy obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        xtreemfs_jniJNI.delete_ClientProxy(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  private OptionsProxy optionsReference;
  private SSLOptionsProxy sslOptionsReference;
  protected void addReferences(OptionsProxy options, SSLOptionsProxy sslOptions) {
    optionsReference = options;
    sslOptionsReference = sslOptions;
  }

  public static ClientProxy createClient(ServiceAddresses dir_service_addresses, org.xtreemfs.foundation.pbrpc.generatedinterfaces.RPC.UserCredentials user_credentials, SSLOptionsProxy ssl_options, OptionsProxy options) {
    long cPtr = xtreemfs_jniJNI.ClientProxy_createClient__SWIG_0(ServiceAddresses.getCPtr(dir_service_addresses), dir_service_addresses, user_credentials.toByteArray(), SSLOptionsProxy.getCPtr(ssl_options), ssl_options, OptionsProxy.getCPtr(options), options);
    ClientProxy ret = null;
    if (cPtr != 0) {
      ret = new ClientProxy(cPtr, true);
      ret.addReferences(options, ssl_options);
    }
    return ret;
}

  public static ClientProxy createClient(ServiceAddresses dir_service_addresses, org.xtreemfs.foundation.pbrpc.generatedinterfaces.RPC.UserCredentials user_credentials, SSLOptionsProxy ssl_options, OptionsProxy options, ClientProxy.ClientImplementationType type) {
    long cPtr = xtreemfs_jniJNI.ClientProxy_createClient__SWIG_1(ServiceAddresses.getCPtr(dir_service_addresses), dir_service_addresses, user_credentials.toByteArray(), SSLOptionsProxy.getCPtr(ssl_options), ssl_options, OptionsProxy.getCPtr(options), options, type.swigValue());
    ClientProxy ret = null;
    if (cPtr != 0) {
      ret = new ClientProxy(cPtr, true);
      ret.addReferences(options, ssl_options);
    }
    return ret;
}

  public void start() throws org.xtreemfs.common.libxtreemfs.exceptions.XtreemFSException {
    xtreemfs_jniJNI.ClientProxy_start(swigCPtr, this);
  }

  public void shutdown() {
    xtreemfs_jniJNI.ClientProxy_shutdown(swigCPtr, this);
  }

  public VolumeProxy openVolumeProxy(String volume_name, SSLOptionsProxy ssl_options, OptionsProxy options) throws org.xtreemfs.common.libxtreemfs.exceptions.AddressToUUIDNotFoundException, org.xtreemfs.common.libxtreemfs.exceptions.XtreemFSException, org.xtreemfs.common.libxtreemfs.exceptions.VolumeNotFoundException {
    long cPtr = xtreemfs_jniJNI.ClientProxy_openVolumeProxy(swigCPtr, this, volume_name, SSLOptionsProxy.getCPtr(ssl_options), ssl_options, OptionsProxy.getCPtr(options), options);
    VolumeProxy ret = null;
    if (cPtr != 0) {
      ret = new VolumeProxy(cPtr, false);
      ret.addReferences(options, ssl_options);
    }
    return ret;
}

  public void createVolume(ServiceAddresses mrc_address, org.xtreemfs.foundation.pbrpc.generatedinterfaces.RPC.Auth auth, org.xtreemfs.foundation.pbrpc.generatedinterfaces.RPC.UserCredentials user_credentials, String volume_name) throws java.io.IOException, org.xtreemfs.common.libxtreemfs.exceptions.PosixErrorException, org.xtreemfs.common.libxtreemfs.exceptions.XtreemFSException {
    xtreemfs_jniJNI.ClientProxy_createVolume__SWIG_0(swigCPtr, this, ServiceAddresses.getCPtr(mrc_address), mrc_address, auth.toByteArray(), user_credentials.toByteArray(), volume_name);
  }

  public void createVolume(ServiceAddresses mrc_address, org.xtreemfs.foundation.pbrpc.generatedinterfaces.RPC.Auth auth, org.xtreemfs.foundation.pbrpc.generatedinterfaces.RPC.UserCredentials user_credentials, String volume_name, int mode, String owner_username, String owner_groupname, org.xtreemfs.pbrpc.generatedinterfaces.GlobalTypes.AccessControlPolicyType access_policy_type, int quota, org.xtreemfs.pbrpc.generatedinterfaces.GlobalTypes.StripingPolicyType default_striping_policy_type, int default_stripe_size, int default_stripe_width, StringMap volume_attributes) throws java.io.IOException, org.xtreemfs.common.libxtreemfs.exceptions.PosixErrorException, org.xtreemfs.common.libxtreemfs.exceptions.XtreemFSException {
    xtreemfs_jniJNI.ClientProxy_createVolume__SWIG_1(swigCPtr, this, ServiceAddresses.getCPtr(mrc_address), mrc_address, auth.toByteArray(), user_credentials.toByteArray(), volume_name, mode, owner_username, owner_groupname, access_policy_type.getNumber(), quota, default_striping_policy_type.getNumber(), default_stripe_size, default_stripe_width, StringMap.getCPtr(volume_attributes), volume_attributes);
  }

  public void createVolume(org.xtreemfs.foundation.pbrpc.generatedinterfaces.RPC.Auth auth, org.xtreemfs.foundation.pbrpc.generatedinterfaces.RPC.UserCredentials user_credentials, String volume_name, int mode, String owner_username, String owner_groupname, org.xtreemfs.pbrpc.generatedinterfaces.GlobalTypes.AccessControlPolicyType access_policy_type, int volume_quota, org.xtreemfs.pbrpc.generatedinterfaces.GlobalTypes.StripingPolicyType default_striping_policy_type, int default_stripe_size, int default_stripe_width, StringMap volume_attributes) throws java.io.IOException, org.xtreemfs.common.libxtreemfs.exceptions.PosixErrorException, org.xtreemfs.common.libxtreemfs.exceptions.XtreemFSException {
    xtreemfs_jniJNI.ClientProxy_createVolume__SWIG_2(swigCPtr, this, auth.toByteArray(), user_credentials.toByteArray(), volume_name, mode, owner_username, owner_groupname, access_policy_type.getNumber(), volume_quota, default_striping_policy_type.getNumber(), default_stripe_size, default_stripe_width, StringMap.getCPtr(volume_attributes), volume_attributes);
  }

  public void deleteVolume(ServiceAddresses mrc_address, org.xtreemfs.foundation.pbrpc.generatedinterfaces.RPC.Auth auth, org.xtreemfs.foundation.pbrpc.generatedinterfaces.RPC.UserCredentials user_credentials, String volume_name) throws java.io.IOException, org.xtreemfs.common.libxtreemfs.exceptions.PosixErrorException, org.xtreemfs.common.libxtreemfs.exceptions.XtreemFSException {
    xtreemfs_jniJNI.ClientProxy_deleteVolume__SWIG_0(swigCPtr, this, ServiceAddresses.getCPtr(mrc_address), mrc_address, auth.toByteArray(), user_credentials.toByteArray(), volume_name);
  }

  public void deleteVolume(org.xtreemfs.foundation.pbrpc.generatedinterfaces.RPC.Auth auth, org.xtreemfs.foundation.pbrpc.generatedinterfaces.RPC.UserCredentials user_credentials, String volume_name) throws java.io.IOException, org.xtreemfs.common.libxtreemfs.exceptions.PosixErrorException, org.xtreemfs.common.libxtreemfs.exceptions.XtreemFSException {
    xtreemfs_jniJNI.ClientProxy_deleteVolume__SWIG_1(swigCPtr, this, auth.toByteArray(), user_credentials.toByteArray(), volume_name);
  }

  public org.xtreemfs.pbrpc.generatedinterfaces.MRC.Volumes listVolumes(ServiceAddresses mrc_addresses, org.xtreemfs.foundation.pbrpc.generatedinterfaces.RPC.Auth auth) throws org.xtreemfs.common.libxtreemfs.exceptions.AddressToUUIDNotFoundException, java.io.IOException, org.xtreemfs.common.libxtreemfs.exceptions.PosixErrorException, org.xtreemfs.common.libxtreemfs.exceptions.XtreemFSException {
  byte[] buf = xtreemfs_jniJNI.ClientProxy_listVolumes(swigCPtr, this, ServiceAddresses.getCPtr(mrc_addresses), mrc_addresses, auth.toByteArray());

  // It is possible that a serialized protobuf message has a length of 0, for 
  // example if it consists only of repeated fields of which none has an entry.
  // In that case it is preferred to parse the (empty) message and return it
  // instead of null. Null is only valid if the native call did return null.
  if (buf == null) {
    return null;
  }

  try {
    return org.xtreemfs.pbrpc.generatedinterfaces.MRC.Volumes.parseFrom(buf);
  } catch (com.google.protobuf.InvalidProtocolBufferException e) {
    throw new RuntimeException(
        "Unable to parse org.xtreemfs.pbrpc.generatedinterfaces.MRC.Volumes protocol message.");
  }
}

  public StringVector listVolumeNames() throws org.xtreemfs.common.libxtreemfs.exceptions.AddressToUUIDNotFoundException, java.io.IOException, org.xtreemfs.common.libxtreemfs.exceptions.PosixErrorException, org.xtreemfs.common.libxtreemfs.exceptions.XtreemFSException {
    return new StringVector(xtreemfs_jniJNI.ClientProxy_listVolumeNames(swigCPtr, this), true);
  }

  public String uUIDToAddress(String uuid) throws org.xtreemfs.common.libxtreemfs.exceptions.AddressToUUIDNotFoundException, org.xtreemfs.common.libxtreemfs.exceptions.XtreemFSException {
    return xtreemfs_jniJNI.ClientProxy_uUIDToAddress(swigCPtr, this, uuid);
  }

  public UUIDResolverProxy getUUIDResolver() {
    long cPtr = xtreemfs_jniJNI.ClientProxy_getUUIDResolver(swigCPtr, this);
    return (cPtr == 0) ? null : new UUIDResolverProxy(cPtr, false);
  }

  public enum ClientImplementationType {
    kDefaultClient;

    public final int swigValue() {
      return swigValue;
    }

    public static ClientImplementationType swigToEnum(int swigValue) {
      ClientImplementationType[] swigValues = ClientImplementationType.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (ClientImplementationType swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + ClientImplementationType.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private ClientImplementationType() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private ClientImplementationType(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private ClientImplementationType(ClientImplementationType swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
