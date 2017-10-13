// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: image/common/common.proto

package org.ditto.sexyimage.common.grpc;

/**
 * Protobuf enum {@code image.common.ImageType}
 */
public enum ImageType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NORMAL = 0;</code>
   */
  NORMAL(0),
  /**
   * <code>POSTER = 1;</code>
   */
  POSTER(1),
  /**
   * <code>SEXY = 2;</code>
   */
  SEXY(2),
  /**
   * <code>PORN = 3;</code>
   */
  PORN(3),
  /**
   * <code>SECRET = 4;</code>
   */
  SECRET(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>NORMAL = 0;</code>
   */
  public static final int NORMAL_VALUE = 0;
  /**
   * <code>POSTER = 1;</code>
   */
  public static final int POSTER_VALUE = 1;
  /**
   * <code>SEXY = 2;</code>
   */
  public static final int SEXY_VALUE = 2;
  /**
   * <code>PORN = 3;</code>
   */
  public static final int PORN_VALUE = 3;
  /**
   * <code>SECRET = 4;</code>
   */
  public static final int SECRET_VALUE = 4;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ImageType valueOf(int value) {
    return forNumber(value);
  }

  public static ImageType forNumber(int value) {
    switch (value) {
      case 0: return NORMAL;
      case 1: return POSTER;
      case 2: return SEXY;
      case 3: return PORN;
      case 4: return SECRET;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ImageType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ImageType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ImageType>() {
          public ImageType findValueByNumber(int number) {
            return ImageType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.ditto.sexyimage.common.grpc.CommonProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ImageType[] VALUES = values();

  public static ImageType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ImageType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:image.common.ImageType)
}

