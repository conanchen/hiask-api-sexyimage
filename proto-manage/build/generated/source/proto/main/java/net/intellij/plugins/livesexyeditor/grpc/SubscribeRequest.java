// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: image/public/image.proto

package net.intellij.plugins.livesexyeditor.grpc;

/**
 * Protobuf type {@code image.public.SubscribeRequest}
 */
public  final class SubscribeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:image.public.SubscribeRequest)
    SubscribeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SubscribeRequest.newBuilder() to construct.
  private SubscribeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SubscribeRequest() {
    types_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SubscribeRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              types_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            types_.add(rawValue);
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                types_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              types_.add(rawValue);
            }
            input.popLimit(oldLimit);
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        types_ = java.util.Collections.unmodifiableList(types_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return net.intellij.plugins.livesexyeditor.grpc.ImageProto.internal_static_image_public_SubscribeRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.intellij.plugins.livesexyeditor.grpc.ImageProto.internal_static_image_public_SubscribeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest.class, net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest.Builder.class);
  }

  public static final int TYPES_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> types_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, org.ditto.sexyimage.common.grpc.ImageType> types_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, org.ditto.sexyimage.common.grpc.ImageType>() {
            public org.ditto.sexyimage.common.grpc.ImageType convert(java.lang.Integer from) {
              org.ditto.sexyimage.common.grpc.ImageType result = org.ditto.sexyimage.common.grpc.ImageType.valueOf(from);
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
    return types_converter_.convert(types_.get(index));
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
    return types_.get(index);
  }
  private int typesMemoizedSerializedSize;

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (getTypesList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(typesMemoizedSerializedSize);
    }
    for (int i = 0; i < types_.size(); i++) {
      output.writeEnumNoTag(types_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < types_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(types_.get(i));
      }
      size += dataSize;
      if (!getTypesList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }typesMemoizedSerializedSize = dataSize;
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest)) {
      return super.equals(obj);
    }
    net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest other = (net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest) obj;

    boolean result = true;
    result = result && types_.equals(other.types_);
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getTypesCount() > 0) {
      hash = (37 * hash) + TYPES_FIELD_NUMBER;
      hash = (53 * hash) + types_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code image.public.SubscribeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:image.public.SubscribeRequest)
      net.intellij.plugins.livesexyeditor.grpc.SubscribeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.intellij.plugins.livesexyeditor.grpc.ImageProto.internal_static_image_public_SubscribeRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.intellij.plugins.livesexyeditor.grpc.ImageProto.internal_static_image_public_SubscribeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest.class, net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest.Builder.class);
    }

    // Construct using net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      types_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.intellij.plugins.livesexyeditor.grpc.ImageProto.internal_static_image_public_SubscribeRequest_descriptor;
    }

    public net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest getDefaultInstanceForType() {
      return net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest.getDefaultInstance();
    }

    public net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest build() {
      net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest buildPartial() {
      net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest result = new net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        types_ = java.util.Collections.unmodifiableList(types_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.types_ = types_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest) {
        return mergeFrom((net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest other) {
      if (other == net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest.getDefaultInstance()) return this;
      if (!other.types_.isEmpty()) {
        if (types_.isEmpty()) {
          types_ = other.types_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTypesIsMutable();
          types_.addAll(other.types_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> types_ =
      java.util.Collections.emptyList();
    private void ensureTypesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        types_ = new java.util.ArrayList<java.lang.Integer>(types_);
        bitField0_ |= 0x00000001;
      }
    }
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
      return types_converter_.convert(types_.get(index));
    }
    /**
     * <code>repeated .image.common.ImageType types = 1;</code>
     */
    public Builder setTypes(
        int index, org.ditto.sexyimage.common.grpc.ImageType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureTypesIsMutable();
      types_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .image.common.ImageType types = 1;</code>
     */
    public Builder addTypes(org.ditto.sexyimage.common.grpc.ImageType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureTypesIsMutable();
      types_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .image.common.ImageType types = 1;</code>
     */
    public Builder addAllTypes(
        java.lang.Iterable<? extends org.ditto.sexyimage.common.grpc.ImageType> values) {
      ensureTypesIsMutable();
      for (org.ditto.sexyimage.common.grpc.ImageType value : values) {
        types_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .image.common.ImageType types = 1;</code>
     */
    public Builder clearTypes() {
      types_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .image.common.ImageType types = 1;</code>
     */
    public java.util.List<java.lang.Integer>
    getTypesValueList() {
      return java.util.Collections.unmodifiableList(types_);
    }
    /**
     * <code>repeated .image.common.ImageType types = 1;</code>
     */
    public int getTypesValue(int index) {
      return types_.get(index);
    }
    /**
     * <code>repeated .image.common.ImageType types = 1;</code>
     */
    public Builder setTypesValue(
        int index, int value) {
      ensureTypesIsMutable();
      types_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .image.common.ImageType types = 1;</code>
     */
    public Builder addTypesValue(int value) {
      ensureTypesIsMutable();
      types_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .image.common.ImageType types = 1;</code>
     */
    public Builder addAllTypesValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureTypesIsMutable();
      for (int value : values) {
        types_.add(value);
      }
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:image.public.SubscribeRequest)
  }

  // @@protoc_insertion_point(class_scope:image.public.SubscribeRequest)
  private static final net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest();
  }

  public static net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubscribeRequest>
      PARSER = new com.google.protobuf.AbstractParser<SubscribeRequest>() {
    public SubscribeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SubscribeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SubscribeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubscribeRequest> getParserForType() {
    return PARSER;
  }

  public net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

