// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: image/common/common.proto

package org.ditto.sexyimage.common.grpc;

/**
 * <pre>
 * Generic message sent when there is nothing else to send back
 * </pre>
 *
 * Protobuf type {@code image.common.StatusResponse}
 */
public  final class StatusResponse extends
    com.google.protobuf.GeneratedMessageLite<
        StatusResponse, StatusResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:image.common.StatusResponse)
    StatusResponseOrBuilder {
  private StatusResponse() {
  }
  public static final int ERROR_FIELD_NUMBER = 1;
  private org.ditto.sexyimage.common.grpc.Error error_;
  /**
   * <code>optional .image.common.Error error = 1;</code>
   */
  public boolean hasError() {
    return error_ != null;
  }
  /**
   * <code>optional .image.common.Error error = 1;</code>
   */
  public org.ditto.sexyimage.common.grpc.Error getError() {
    return error_ == null ? org.ditto.sexyimage.common.grpc.Error.getDefaultInstance() : error_;
  }
  /**
   * <code>optional .image.common.Error error = 1;</code>
   */
  private void setError(org.ditto.sexyimage.common.grpc.Error value) {
    if (value == null) {
      throw new NullPointerException();
    }
    error_ = value;
    
    }
  /**
   * <code>optional .image.common.Error error = 1;</code>
   */
  private void setError(
      org.ditto.sexyimage.common.grpc.Error.Builder builderForValue) {
    error_ = builderForValue.build();
    
  }
  /**
   * <code>optional .image.common.Error error = 1;</code>
   */
  private void mergeError(org.ditto.sexyimage.common.grpc.Error value) {
    if (error_ != null &&
        error_ != org.ditto.sexyimage.common.grpc.Error.getDefaultInstance()) {
      error_ =
        org.ditto.sexyimage.common.grpc.Error.newBuilder(error_).mergeFrom(value).buildPartial();
    } else {
      error_ = value;
    }
    
  }
  /**
   * <code>optional .image.common.Error error = 1;</code>
   */
  private void clearError() {  error_ = null;
    
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (error_ != null) {
      output.writeMessage(1, getError());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (error_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getError());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static org.ditto.sexyimage.common.grpc.StatusResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.ditto.sexyimage.common.grpc.StatusResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.ditto.sexyimage.common.grpc.StatusResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.ditto.sexyimage.common.grpc.StatusResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.ditto.sexyimage.common.grpc.StatusResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.ditto.sexyimage.common.grpc.StatusResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.ditto.sexyimage.common.grpc.StatusResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.ditto.sexyimage.common.grpc.StatusResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.ditto.sexyimage.common.grpc.StatusResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.ditto.sexyimage.common.grpc.StatusResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.ditto.sexyimage.common.grpc.StatusResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Generic message sent when there is nothing else to send back
   * </pre>
   *
   * Protobuf type {@code image.common.StatusResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.ditto.sexyimage.common.grpc.StatusResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:image.common.StatusResponse)
      org.ditto.sexyimage.common.grpc.StatusResponseOrBuilder {
    // Construct using org.ditto.sexyimage.common.grpc.StatusResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional .image.common.Error error = 1;</code>
     */
    public boolean hasError() {
      return instance.hasError();
    }
    /**
     * <code>optional .image.common.Error error = 1;</code>
     */
    public org.ditto.sexyimage.common.grpc.Error getError() {
      return instance.getError();
    }
    /**
     * <code>optional .image.common.Error error = 1;</code>
     */
    public Builder setError(org.ditto.sexyimage.common.grpc.Error value) {
      copyOnWrite();
      instance.setError(value);
      return this;
      }
    /**
     * <code>optional .image.common.Error error = 1;</code>
     */
    public Builder setError(
        org.ditto.sexyimage.common.grpc.Error.Builder builderForValue) {
      copyOnWrite();
      instance.setError(builderForValue);
      return this;
    }
    /**
     * <code>optional .image.common.Error error = 1;</code>
     */
    public Builder mergeError(org.ditto.sexyimage.common.grpc.Error value) {
      copyOnWrite();
      instance.mergeError(value);
      return this;
    }
    /**
     * <code>optional .image.common.Error error = 1;</code>
     */
    public Builder clearError() {  copyOnWrite();
      instance.clearError();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:image.common.StatusResponse)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.ditto.sexyimage.common.grpc.StatusResponse();
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
        org.ditto.sexyimage.common.grpc.StatusResponse other = (org.ditto.sexyimage.common.grpc.StatusResponse) arg1;
        error_ = visitor.visitMessage(error_, other.error_);
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
                org.ditto.sexyimage.common.grpc.Error.Builder subBuilder = null;
                if (error_ != null) {
                  subBuilder = error_.toBuilder();
                }
                error_ = input.readMessage(org.ditto.sexyimage.common.grpc.Error.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(error_);
                  error_ = subBuilder.buildPartial();
                }

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
        if (PARSER == null) {    synchronized (org.ditto.sexyimage.common.grpc.StatusResponse.class) {
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


  // @@protoc_insertion_point(class_scope:image.common.StatusResponse)
  private static final org.ditto.sexyimage.common.grpc.StatusResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new StatusResponse();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.ditto.sexyimage.common.grpc.StatusResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<StatusResponse> PARSER;

  public static com.google.protobuf.Parser<StatusResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

