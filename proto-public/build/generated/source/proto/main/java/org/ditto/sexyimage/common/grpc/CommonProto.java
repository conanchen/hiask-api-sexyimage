// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: image/common/common.proto

package org.ditto.sexyimage.common.grpc;

public final class CommonProto {
  private CommonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_image_common_Error_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_image_common_Error_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_image_common_StatusResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_image_common_StatusResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_image_common_ImageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_image_common_ImageResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031image/common/common.proto\022\014image.commo" +
      "n\"&\n\005Error\022\014\n\004code\030\001 \001(\t\022\017\n\007details\030\002 \001(" +
      "\t\"4\n\016StatusResponse\022\"\n\005error\030\001 \001(\0132\023.ima" +
      "ge.common.Error\"\226\001\n\rImageResponse\022\013\n\003url" +
      "\030\001 \001(\t\022\017\n\007infoUrl\030\002 \001(\t\022\r\n\005title\030\003 \001(\t\022\014" +
      "\n\004desc\030\004 \001(\t\022%\n\004type\030\005 \001(\0162\027.image.commo" +
      "n.ImageType\022\023\n\013lastUpdated\030\006 \001(\003\022\016\n\006acti" +
      "ve\030\007 \001(\010*C\n\tImageType\022\n\n\006NORMAL\020\000\022\n\n\006POS" +
      "TER\020\001\022\010\n\004SEXY\020\002\022\010\n\004PORN\020\003\022\n\n\006SECRET\020\004B6\n" +
      "\037org.ditto.sexyimage.common.grpcB\013Common",
      "ProtoP\001\242\002\003CMNb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_image_common_Error_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_image_common_Error_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_image_common_Error_descriptor,
        new java.lang.String[] { "Code", "Details", });
    internal_static_image_common_StatusResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_image_common_StatusResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_image_common_StatusResponse_descriptor,
        new java.lang.String[] { "Error", });
    internal_static_image_common_ImageResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_image_common_ImageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_image_common_ImageResponse_descriptor,
        new java.lang.String[] { "Url", "InfoUrl", "Title", "Desc", "Type", "LastUpdated", "Active", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
