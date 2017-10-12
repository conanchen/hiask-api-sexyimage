// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: image/common/common.proto

package org.ditto.sexyimage.common.grpc;

/**
 * Protobuf type {@code image.common.Error}
 */
public  final class Error extends
    com.google.protobuf.GeneratedMessageLite<
        Error, Error.Builder> implements
    // @@protoc_insertion_point(message_implements:image.common.Error)
    ErrorOrBuilder {
  private Error() {
    code_ = "";
    details_ = "";
  }
  public static final int CODE_FIELD_NUMBER = 1;
  private java.lang.String code_;
  /**
   * <code>optional string code = 1;</code>
   */
  public java.lang.String getCode() {
    return code_;
  }
  /**
   * <code>optional string code = 1;</code>
   */
  public com.google.protobuf.ByteString
      getCodeBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(code_);
  }
  /**
   * <code>optional string code = 1;</code>
   */
  private void setCode(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    code_ = value;
  }
  /**
   * <code>optional string code = 1;</code>
   */
  private void clearCode() {
    
    code_ = getDefaultInstance().getCode();
  }
  /**
   * <code>optional string code = 1;</code>
   */
  private void setCodeBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    code_ = value.toStringUtf8();
  }

  public static final int DETAILS_FIELD_NUMBER = 2;
  private java.lang.String details_;
  /**
   * <code>optional string details = 2;</code>
   */
  public java.lang.String getDetails() {
    return details_;
  }
  /**
   * <code>optional string details = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDetailsBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(details_);
  }
  /**
   * <code>optional string details = 2;</code>
   */
  private void setDetails(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    details_ = value;
  }
  /**
   * <code>optional string details = 2;</code>
   */
  private void clearDetails() {
    
    details_ = getDefaultInstance().getDetails();
  }
  /**
   * <code>optional string details = 2;</code>
   */
  private void setDetailsBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    details_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!code_.isEmpty()) {
      output.writeString(1, getCode());
    }
    if (!details_.isEmpty()) {
      output.writeString(2, getDetails());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!code_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getCode());
    }
    if (!details_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getDetails());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static org.ditto.sexyimage.common.grpc.Error parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.ditto.sexyimage.common.grpc.Error parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.ditto.sexyimage.common.grpc.Error parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.ditto.sexyimage.common.grpc.Error parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.ditto.sexyimage.common.grpc.Error parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.ditto.sexyimage.common.grpc.Error parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.ditto.sexyimage.common.grpc.Error parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.ditto.sexyimage.common.grpc.Error parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.ditto.sexyimage.common.grpc.Error parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.ditto.sexyimage.common.grpc.Error parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.ditto.sexyimage.common.grpc.Error prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code image.common.Error}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.ditto.sexyimage.common.grpc.Error, Builder> implements
      // @@protoc_insertion_point(builder_implements:image.common.Error)
      org.ditto.sexyimage.common.grpc.ErrorOrBuilder {
    // Construct using org.ditto.sexyimage.common.grpc.Error.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional string code = 1;</code>
     */
    public java.lang.String getCode() {
      return instance.getCode();
    }
    /**
     * <code>optional string code = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCodeBytes() {
      return instance.getCodeBytes();
    }
    /**
     * <code>optional string code = 1;</code>
     */
    public Builder setCode(
        java.lang.String value) {
      copyOnWrite();
      instance.setCode(value);
      return this;
    }
    /**
     * <code>optional string code = 1;</code>
     */
    public Builder clearCode() {
      copyOnWrite();
      instance.clearCode();
      return this;
    }
    /**
     * <code>optional string code = 1;</code>
     */
    public Builder setCodeBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setCodeBytes(value);
      return this;
    }

    /**
     * <code>optional string details = 2;</code>
     */
    public java.lang.String getDetails() {
      return instance.getDetails();
    }
    /**
     * <code>optional string details = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDetailsBytes() {
      return instance.getDetailsBytes();
    }
    /**
     * <code>optional string details = 2;</code>
     */
    public Builder setDetails(
        java.lang.String value) {
      copyOnWrite();
      instance.setDetails(value);
      return this;
    }
    /**
     * <code>optional string details = 2;</code>
     */
    public Builder clearDetails() {
      copyOnWrite();
      instance.clearDetails();
      return this;
    }
    /**
     * <code>optional string details = 2;</code>
     */
    public Builder setDetailsBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setDetailsBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:image.common.Error)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.ditto.sexyimage.common.grpc.Error();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        org.ditto.sexyimage.common.grpc.Error other = (org.ditto.sexyimage.common.grpc.Error) arg1;
        code_ = visitor.visitString(!code_.isEmpty(), code_,
            !other.code_.isEmpty(), other.code_);
        details_ = visitor.visitString(!details_.isEmpty(), details_,
            !other.details_.isEmpty(), other.details_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!input.skipField(tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                String s = input.readStringRequireUtf8();

                code_ = s;
                break;
              }
              case 18: {
                String s = input.readStringRequireUtf8();

                details_ = s;
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (org.ditto.sexyimage.common.grpc.Error.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:image.common.Error)
  private static final org.ditto.sexyimage.common.grpc.Error DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Error();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.ditto.sexyimage.common.grpc.Error getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Error> PARSER;

  public static com.google.protobuf.Parser<Error> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

