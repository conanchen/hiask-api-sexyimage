// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: image/manage/imageman.proto

package org.ditto.sexyimage.manage.grpc;

public interface UpsertRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:image.manage.UpsertRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string url = 1;</code>
   */
  java.lang.String getUrl();
  /**
   * <code>optional string url = 1;</code>
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <code>optional string infoUrl = 2;</code>
   */
  java.lang.String getInfoUrl();
  /**
   * <code>optional string infoUrl = 2;</code>
   */
  com.google.protobuf.ByteString
      getInfoUrlBytes();

  /**
   * <code>optional string title = 3;</code>
   */
  java.lang.String getTitle();
  /**
   * <code>optional string title = 3;</code>
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>optional string desc = 4;</code>
   */
  java.lang.String getDesc();
  /**
   * <code>optional string desc = 4;</code>
   */
  com.google.protobuf.ByteString
      getDescBytes();

  /**
   * <code>optional .image.common.ImageType type = 5;</code>
   */
  int getTypeValue();
  /**
   * <code>optional .image.common.ImageType type = 5;</code>
   */
  org.ditto.sexyimage.common.grpc.ImageType getType();

  /**
   * <code>optional bool active = 6;</code>
   */
  boolean getActive();

  /**
   * <code>optional bool toprank = 7;</code>
   */
  boolean getToprank();
}
