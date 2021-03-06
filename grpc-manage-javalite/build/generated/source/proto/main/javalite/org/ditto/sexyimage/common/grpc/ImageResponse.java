// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: image/common/common.proto

package org.ditto.sexyimage.common.grpc;

/**
 * Protobuf type {@code image.common.ImageResponse}
 */
public  final class ImageResponse extends
    com.google.protobuf.GeneratedMessageLite<
        ImageResponse, ImageResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:image.common.ImageResponse)
    ImageResponseOrBuilder {
  private ImageResponse() {
    url_ = "";
    infoUrl_ = "";
    title_ = "";
    desc_ = "";
  }
  public static final int URL_FIELD_NUMBER = 1;
  private java.lang.String url_;
  /**
   * <code>optional string url = 1;</code>
   */
  public java.lang.String getUrl() {
    return url_;
  }
  /**
   * <code>optional string url = 1;</code>
   */
  public com.google.protobuf.ByteString
      getUrlBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(url_);
  }
  /**
   * <code>optional string url = 1;</code>
   */
  private void setUrl(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    url_ = value;
  }
  /**
   * <code>optional string url = 1;</code>
   */
  private void clearUrl() {
    
    url_ = getDefaultInstance().getUrl();
  }
  /**
   * <code>optional string url = 1;</code>
   */
  private void setUrlBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    url_ = value.toStringUtf8();
  }

  public static final int INFOURL_FIELD_NUMBER = 2;
  private java.lang.String infoUrl_;
  /**
   * <code>optional string infoUrl = 2;</code>
   */
  public java.lang.String getInfoUrl() {
    return infoUrl_;
  }
  /**
   * <code>optional string infoUrl = 2;</code>
   */
  public com.google.protobuf.ByteString
      getInfoUrlBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(infoUrl_);
  }
  /**
   * <code>optional string infoUrl = 2;</code>
   */
  private void setInfoUrl(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    infoUrl_ = value;
  }
  /**
   * <code>optional string infoUrl = 2;</code>
   */
  private void clearInfoUrl() {
    
    infoUrl_ = getDefaultInstance().getInfoUrl();
  }
  /**
   * <code>optional string infoUrl = 2;</code>
   */
  private void setInfoUrlBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    infoUrl_ = value.toStringUtf8();
  }

  public static final int TITLE_FIELD_NUMBER = 3;
  private java.lang.String title_;
  /**
   * <code>optional string title = 3;</code>
   */
  public java.lang.String getTitle() {
    return title_;
  }
  /**
   * <code>optional string title = 3;</code>
   */
  public com.google.protobuf.ByteString
      getTitleBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(title_);
  }
  /**
   * <code>optional string title = 3;</code>
   */
  private void setTitle(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    title_ = value;
  }
  /**
   * <code>optional string title = 3;</code>
   */
  private void clearTitle() {
    
    title_ = getDefaultInstance().getTitle();
  }
  /**
   * <code>optional string title = 3;</code>
   */
  private void setTitleBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    title_ = value.toStringUtf8();
  }

  public static final int DESC_FIELD_NUMBER = 4;
  private java.lang.String desc_;
  /**
   * <code>optional string desc = 4;</code>
   */
  public java.lang.String getDesc() {
    return desc_;
  }
  /**
   * <code>optional string desc = 4;</code>
   */
  public com.google.protobuf.ByteString
      getDescBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(desc_);
  }
  /**
   * <code>optional string desc = 4;</code>
   */
  private void setDesc(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    desc_ = value;
  }
  /**
   * <code>optional string desc = 4;</code>
   */
  private void clearDesc() {
    
    desc_ = getDefaultInstance().getDesc();
  }
  /**
   * <code>optional string desc = 4;</code>
   */
  private void setDescBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    desc_ = value.toStringUtf8();
  }

  public static final int TYPE_FIELD_NUMBER = 5;
  private int type_;
  /**
   * <code>optional .image.common.ImageType type = 5;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <code>optional .image.common.ImageType type = 5;</code>
   */
  public org.ditto.sexyimage.common.grpc.ImageType getType() {
    org.ditto.sexyimage.common.grpc.ImageType result = org.ditto.sexyimage.common.grpc.ImageType.forNumber(type_);
    return result == null ? org.ditto.sexyimage.common.grpc.ImageType.UNRECOGNIZED : result;
  }
  /**
   * <code>optional .image.common.ImageType type = 5;</code>
   */
  private void setTypeValue(int value) {
      type_ = value;
  }
  /**
   * <code>optional .image.common.ImageType type = 5;</code>
   */
  private void setType(org.ditto.sexyimage.common.grpc.ImageType value) {
    if (value == null) {
      throw new NullPointerException();
    }
    
    type_ = value.getNumber();
  }
  /**
   * <code>optional .image.common.ImageType type = 5;</code>
   */
  private void clearType() {
    
    type_ = 0;
  }

  public static final int LASTUPDATED_FIELD_NUMBER = 6;
  private long lastUpdated_;
  /**
   * <code>optional int64 lastUpdated = 6;</code>
   */
  public long getLastUpdated() {
    return lastUpdated_;
  }
  /**
   * <code>optional int64 lastUpdated = 6;</code>
   */
  private void setLastUpdated(long value) {
    
    lastUpdated_ = value;
  }
  /**
   * <code>optional int64 lastUpdated = 6;</code>
   */
  private void clearLastUpdated() {
    
    lastUpdated_ = 0L;
  }

  public static final int ACTIVE_FIELD_NUMBER = 7;
  private boolean active_;
  /**
   * <code>optional bool active = 7;</code>
   */
  public boolean getActive() {
    return active_;
  }
  /**
   * <code>optional bool active = 7;</code>
   */
  private void setActive(boolean value) {
    
    active_ = value;
  }
  /**
   * <code>optional bool active = 7;</code>
   */
  private void clearActive() {
    
    active_ = false;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!url_.isEmpty()) {
      output.writeString(1, getUrl());
    }
    if (!infoUrl_.isEmpty()) {
      output.writeString(2, getInfoUrl());
    }
    if (!title_.isEmpty()) {
      output.writeString(3, getTitle());
    }
    if (!desc_.isEmpty()) {
      output.writeString(4, getDesc());
    }
    if (type_ != org.ditto.sexyimage.common.grpc.ImageType.NORMAL.getNumber()) {
      output.writeEnum(5, type_);
    }
    if (lastUpdated_ != 0L) {
      output.writeInt64(6, lastUpdated_);
    }
    if (active_ != false) {
      output.writeBool(7, active_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!url_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getUrl());
    }
    if (!infoUrl_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getInfoUrl());
    }
    if (!title_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getTitle());
    }
    if (!desc_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(4, getDesc());
    }
    if (type_ != org.ditto.sexyimage.common.grpc.ImageType.NORMAL.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, type_);
    }
    if (lastUpdated_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, lastUpdated_);
    }
    if (active_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(7, active_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static org.ditto.sexyimage.common.grpc.ImageResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.ditto.sexyimage.common.grpc.ImageResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.ditto.sexyimage.common.grpc.ImageResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.ditto.sexyimage.common.grpc.ImageResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.ditto.sexyimage.common.grpc.ImageResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.ditto.sexyimage.common.grpc.ImageResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.ditto.sexyimage.common.grpc.ImageResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.ditto.sexyimage.common.grpc.ImageResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.ditto.sexyimage.common.grpc.ImageResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.ditto.sexyimage.common.grpc.ImageResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.ditto.sexyimage.common.grpc.ImageResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code image.common.ImageResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.ditto.sexyimage.common.grpc.ImageResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:image.common.ImageResponse)
      org.ditto.sexyimage.common.grpc.ImageResponseOrBuilder {
    // Construct using org.ditto.sexyimage.common.grpc.ImageResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional string url = 1;</code>
     */
    public java.lang.String getUrl() {
      return instance.getUrl();
    }
    /**
     * <code>optional string url = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      return instance.getUrlBytes();
    }
    /**
     * <code>optional string url = 1;</code>
     */
    public Builder setUrl(
        java.lang.String value) {
      copyOnWrite();
      instance.setUrl(value);
      return this;
    }
    /**
     * <code>optional string url = 1;</code>
     */
    public Builder clearUrl() {
      copyOnWrite();
      instance.clearUrl();
      return this;
    }
    /**
     * <code>optional string url = 1;</code>
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setUrlBytes(value);
      return this;
    }

    /**
     * <code>optional string infoUrl = 2;</code>
     */
    public java.lang.String getInfoUrl() {
      return instance.getInfoUrl();
    }
    /**
     * <code>optional string infoUrl = 2;</code>
     */
    public com.google.protobuf.ByteString
        getInfoUrlBytes() {
      return instance.getInfoUrlBytes();
    }
    /**
     * <code>optional string infoUrl = 2;</code>
     */
    public Builder setInfoUrl(
        java.lang.String value) {
      copyOnWrite();
      instance.setInfoUrl(value);
      return this;
    }
    /**
     * <code>optional string infoUrl = 2;</code>
     */
    public Builder clearInfoUrl() {
      copyOnWrite();
      instance.clearInfoUrl();
      return this;
    }
    /**
     * <code>optional string infoUrl = 2;</code>
     */
    public Builder setInfoUrlBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setInfoUrlBytes(value);
      return this;
    }

    /**
     * <code>optional string title = 3;</code>
     */
    public java.lang.String getTitle() {
      return instance.getTitle();
    }
    /**
     * <code>optional string title = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      return instance.getTitleBytes();
    }
    /**
     * <code>optional string title = 3;</code>
     */
    public Builder setTitle(
        java.lang.String value) {
      copyOnWrite();
      instance.setTitle(value);
      return this;
    }
    /**
     * <code>optional string title = 3;</code>
     */
    public Builder clearTitle() {
      copyOnWrite();
      instance.clearTitle();
      return this;
    }
    /**
     * <code>optional string title = 3;</code>
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTitleBytes(value);
      return this;
    }

    /**
     * <code>optional string desc = 4;</code>
     */
    public java.lang.String getDesc() {
      return instance.getDesc();
    }
    /**
     * <code>optional string desc = 4;</code>
     */
    public com.google.protobuf.ByteString
        getDescBytes() {
      return instance.getDescBytes();
    }
    /**
     * <code>optional string desc = 4;</code>
     */
    public Builder setDesc(
        java.lang.String value) {
      copyOnWrite();
      instance.setDesc(value);
      return this;
    }
    /**
     * <code>optional string desc = 4;</code>
     */
    public Builder clearDesc() {
      copyOnWrite();
      instance.clearDesc();
      return this;
    }
    /**
     * <code>optional string desc = 4;</code>
     */
    public Builder setDescBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setDescBytes(value);
      return this;
    }

    /**
     * <code>optional .image.common.ImageType type = 5;</code>
     */
    public int getTypeValue() {
      return instance.getTypeValue();
    }
    /**
     * <code>optional .image.common.ImageType type = 5;</code>
     */
    public Builder setTypeValue(int value) {
      copyOnWrite();
      instance.setTypeValue(value);
      return this;
    }
    /**
     * <code>optional .image.common.ImageType type = 5;</code>
     */
    public org.ditto.sexyimage.common.grpc.ImageType getType() {
      return instance.getType();
    }
    /**
     * <code>optional .image.common.ImageType type = 5;</code>
     */
    public Builder setType(org.ditto.sexyimage.common.grpc.ImageType value) {
      copyOnWrite();
      instance.setType(value);
      return this;
    }
    /**
     * <code>optional .image.common.ImageType type = 5;</code>
     */
    public Builder clearType() {
      copyOnWrite();
      instance.clearType();
      return this;
    }

    /**
     * <code>optional int64 lastUpdated = 6;</code>
     */
    public long getLastUpdated() {
      return instance.getLastUpdated();
    }
    /**
     * <code>optional int64 lastUpdated = 6;</code>
     */
    public Builder setLastUpdated(long value) {
      copyOnWrite();
      instance.setLastUpdated(value);
      return this;
    }
    /**
     * <code>optional int64 lastUpdated = 6;</code>
     */
    public Builder clearLastUpdated() {
      copyOnWrite();
      instance.clearLastUpdated();
      return this;
    }

    /**
     * <code>optional bool active = 7;</code>
     */
    public boolean getActive() {
      return instance.getActive();
    }
    /**
     * <code>optional bool active = 7;</code>
     */
    public Builder setActive(boolean value) {
      copyOnWrite();
      instance.setActive(value);
      return this;
    }
    /**
     * <code>optional bool active = 7;</code>
     */
    public Builder clearActive() {
      copyOnWrite();
      instance.clearActive();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:image.common.ImageResponse)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.ditto.sexyimage.common.grpc.ImageResponse();
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
        org.ditto.sexyimage.common.grpc.ImageResponse other = (org.ditto.sexyimage.common.grpc.ImageResponse) arg1;
        url_ = visitor.visitString(!url_.isEmpty(), url_,
            !other.url_.isEmpty(), other.url_);
        infoUrl_ = visitor.visitString(!infoUrl_.isEmpty(), infoUrl_,
            !other.infoUrl_.isEmpty(), other.infoUrl_);
        title_ = visitor.visitString(!title_.isEmpty(), title_,
            !other.title_.isEmpty(), other.title_);
        desc_ = visitor.visitString(!desc_.isEmpty(), desc_,
            !other.desc_.isEmpty(), other.desc_);
        type_ = visitor.visitInt(type_ != 0, type_,    other.type_ != 0, other.type_);
        lastUpdated_ = visitor.visitLong(lastUpdated_ != 0L, lastUpdated_,
            other.lastUpdated_ != 0L, other.lastUpdated_);
        active_ = visitor.visitBoolean(active_ != false, active_,
            other.active_ != false, other.active_);
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

                url_ = s;
                break;
              }
              case 18: {
                String s = input.readStringRequireUtf8();

                infoUrl_ = s;
                break;
              }
              case 26: {
                String s = input.readStringRequireUtf8();

                title_ = s;
                break;
              }
              case 34: {
                String s = input.readStringRequireUtf8();

                desc_ = s;
                break;
              }
              case 40: {
                int rawValue = input.readEnum();

                type_ = rawValue;
                break;
              }
              case 48: {

                lastUpdated_ = input.readInt64();
                break;
              }
              case 56: {

                active_ = input.readBool();
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
        if (PARSER == null) {    synchronized (org.ditto.sexyimage.common.grpc.ImageResponse.class) {
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


  // @@protoc_insertion_point(class_scope:image.common.ImageResponse)
  private static final org.ditto.sexyimage.common.grpc.ImageResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ImageResponse();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.ditto.sexyimage.common.grpc.ImageResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ImageResponse> PARSER;

  public static com.google.protobuf.Parser<ImageResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

