// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: image/public/singin.proto

package org.ditto.singin.grpc;

public final class SigninProto {
  private SigninProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_image_public_SignInRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_image_public_SignInRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_image_public_SignInResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_image_public_SignInResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031image/public/singin.proto\022\014image.publi" +
      "c\032\031image/common/common.proto\"%\n\rSignInRe" +
      "quest\022\024\n\014gitkit_token\030\001 \001(\t\"H\n\016SignInRes" +
      "ponse\022\"\n\005error\030\001 \001(\0132\023.image.common.Erro" +
      "r\022\022\n\nuser_token\030\002 \001(\t2O\n\006Singin\022E\n\006SignI" +
      "n\022\033.image.public.SignInRequest\032\034.image.p" +
      "ublic.SignInResponse\"\000B,\n\025org.ditto.sing" +
      "in.grpcB\013SigninProtoP\001\242\002\003SGNb\006proto3"
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
          org.ditto.sexyimage.common.grpc.CommonProto.getDescriptor(),
        }, assigner);
    internal_static_image_public_SignInRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_image_public_SignInRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_image_public_SignInRequest_descriptor,
        new java.lang.String[] { "GitkitToken", });
    internal_static_image_public_SignInResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_image_public_SignInResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_image_public_SignInResponse_descriptor,
        new java.lang.String[] { "Error", "UserToken", });
    org.ditto.sexyimage.common.grpc.CommonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}