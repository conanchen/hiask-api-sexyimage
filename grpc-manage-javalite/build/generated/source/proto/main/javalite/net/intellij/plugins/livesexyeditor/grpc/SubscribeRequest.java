// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: image/public/image.proto

package net.intellij.plugins.livesexyeditor.grpc;

/**
 * Protobuf type {@code image.public.SubscribeRequest}
 */
public  final class SubscribeRequest extends
    com.google.protobuf.GeneratedMessageLite<
        SubscribeRequest, SubscribeRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:image.public.SubscribeRequest)
    SubscribeRequestOrBuilder {
  private SubscribeRequest() {
    types_ = emptyIntList();
  }
  public static final int TYPES_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.IntList types_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, org.ditto.sexyimage.common.grpc.ImageType> types_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, org.ditto.sexyimage.common.grpc.ImageType>() {
            public org.ditto.sexyimage.common.grpc.ImageType convert(java.lang.Integer from) {
              org.ditto.sexyimage.common.grpc.ImageType result = org.ditto.sexyimage.common.grpc.ImageType.forNumber(from);
              return result == null ? org.ditto.sexyimage.common.grpc.ImageType.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .image.common.ImageType types = 1;</code>
   */
  public java.util.List<org.ditto.sexyimage.common.grpc.ImageType> getTypesList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, org.ditto.sexyimage.common.grpc.ImageType>(types_, types_converter_);
  }
  /**
   * <code>repeated .image.common.ImageType types = 1;</code>
   */
  public int getTypesCount() {
    return types_.size();
  }
  /**
   * <code>repeated .image.common.ImageType types = 1;</code>
   */
  public org.ditto.sexyimage.common.grpc.ImageType getTypes(int index) {
    return types_converter_.convert(types_.getInt(index));
  }
  /**
   * <code>repeated .image.common.ImageType types = 1;</code>
   */
  public java.util.List<java.lang.Integer>
  getTypesValueList() {
    return types_;
  }
  /**
   * <code>repeated .image.common.ImageType types = 1;</code>
   */
  public int getTypesValue(int index) {
    return types_.getInt(index);
  }
  private void ensureTypesIsMutable() {
    if (!types_.isModifiable()) {
      types_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(types_);
    }
  }
  /**
   * <code>repeated .image.common.ImageType types = 1;</code>
   */
  private void setTypes(
      int index, org.ditto.sexyimage.common.grpc.ImageType value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureTypesIsMutable();
    types_.setInt(index, value.getNumber());
  }
  /**
   * <code>repeated .image.common.ImageType types = 1;</code>
   */
  private void addTypes(org.ditto.sexyimage.common.grpc.ImageType value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureTypesIsMutable();
    types_.addInt(value.getNumber());
  }
  /**
   * <code>repeated .image.common.ImageType types = 1;</code>
   */
  private void addAllTypes(
      java.lang.Iterable<? extends org.ditto.sexyimage.common.grpc.ImageType> values) {
    ensureTypesIsMutable();
    for (org.ditto.sexyimage.common.grpc.ImageType value : values) {
      types_.addInt(value.getNumber());
    }
  }
  /**
   * <code>repeated .image.common.ImageType types = 1;</code>
   */
  private void clearTypes() {
    types_ = emptyIntList();
  }
  /**
   * <code>repeated .image.common.ImageType types = 1;</code>
   */
  private void setTypesValue(
      int index, int value) {
    ensureTypesIsMutable();
    types_.setInt(index, value);
  }
  /**
   * <code>repeated .image.common.ImageType types = 1;</code>
   */
  private void addTypesValue(int value) {
    ensureTypesIsMutable();
    types_.addInt(value);
  }
  /**
   * <code>repeated .image.common.ImageType types = 1;</code>
   */
  private void addAllTypesValue(
      java.lang.Iterable<java.lang.Integer> values) {
    ensureTypesIsMutable();
    for (int value : values) {
      types_.addInt(value);
    }
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    for (int i = 0; i < types_.size(); i++) {
      output.writeEnum(1, types_.getInt(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < types_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(types_.getInt(i));
      }
      size += dataSize;
      size += 1 * types_.size();
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code image.public.SubscribeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:image.public.SubscribeRequest)
      net.intellij.plugins.livesexyeditor.grpc.SubscribeRequestOrBuilder {
    // Construct using net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>repeated .image.common.ImageType types = 1;</code>
     */
    public java.util.List<org.ditto.sexyimage.common.grpc.ImageType> getTypesList() {
      return instance.getTypesList();
    }
    /**
     * <code>repeated .image.common.ImageType types = 1;</code>
     */
    public int getTypesCount() {
      return instance.getTypesCount();
    }
    /**
     * <code>repeated .image.common.ImageType types = 1;</code>
     */
    public org.ditto.sexyimage.common.grpc.ImageType getTypes(int index) {
      return instance.getTypes(index);
    }
    /**
     * <code>repeated .image.common.ImageType types = 1;</code>
     */
    public Builder setTypes(
        int index, org.ditto.sexyimage.common.grpc.ImageType value) {
      copyOnWrite();
      instance.setTypes(index, value);
      return this;
    }
    /**
     * <code>repeated .image.common.ImageType types = 1;</code>
     */
    public Builder addTypes(org.ditto.sexyimage.common.grpc.ImageType value) {
      copyOnWrite();
      instance.addTypes(value);
      return this;
    }
    /**
     * <code>repeated .image.common.ImageType types = 1;</code>
     */
    public Builder addAllTypes(
        java.lang.Iterable<? extends org.ditto.sexyimage.common.grpc.ImageType> values) {
      copyOnWrite();
      instance.addAllTypes(values);  return this;
    }
    /**
     * <code>repeated .image.common.ImageType types = 1;</code>
     */
    public Builder clearTypes() {
      copyOnWrite();
      instance.clearTypes();
      return this;
    }
    /**
     * <code>repeated .image.common.ImageType types = 1;</code>
     */
    public java.util.List<java.lang.Integer>
    getTypesValueList() {
      return java.util.Collections.unmodifiableList(
          instance.getTypesValueList());
    }
    /**
     * <code>repeated .image.common.ImageType types = 1;</code>
     */
    public int getTypesValue(int index) {
      return instance.getTypesValue(index);
    }
    /**
     * <code>repeated .image.common.ImageType types = 1;</code>
     */
    public Builder setTypesValue(
        int index, int value) {
      copyOnWrite();
      instance.setTypesValue(index, value);
      return this;
    }
    /**
     * <code>repeated .image.common.ImageType types = 1;</code>
     */
    public Builder addTypesValue(int value) {
      instance.addTypesValue(value);
      return this;
    }
    /**
     * <code>repeated .image.common.ImageType types = 1;</code>
     */
    public Builder addAllTypesValue(
        java.lang.Iterable<java.lang.Integer> values) {
      copyOnWrite();
      instance.addAllTypesValue(values);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:image.public.SubscribeRequest)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        types_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest other = (net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest) arg1;
        types_= visitor.visitIntList(types_, other.types_);
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
              case 8: {
                if (!types_.isModifiable()) {
                  types_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(types_);
                }
                types_.addInt(input.readEnum());
                break;
              }
              case 10: {
                if (!types_.isModifiable()) {
                  types_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(types_);
                }
                int length = input.readRawVarint32();
                int oldLimit = input.pushLimit(length);
                while(input.getBytesUntilLimit() > 0) {
                  types_.addInt(input.readEnum());
                }
                input.popLimit(oldLimit);
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
        if (PARSER == null) {    synchronized (net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest.class) {
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


  // @@protoc_insertion_point(class_scope:image.public.SubscribeRequest)
  private static final net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SubscribeRequest();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<SubscribeRequest> PARSER;

  public static com.google.protobuf.Parser<SubscribeRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

