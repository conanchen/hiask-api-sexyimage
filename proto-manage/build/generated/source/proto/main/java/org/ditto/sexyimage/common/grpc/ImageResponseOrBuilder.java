// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: image/common/common.proto

package org.ditto.sexyimage.common.grpc;

public interface ImageResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:image.common.ImageResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string url = 1;</code>
   */
  java.lang.String getUrl();
  /**
   * <code>string url = 1;</code>
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <code>string infoUrl = 2;</code>
   */
  java.lang.String getInfoUrl();
  /**
   * <code>string infoUrl = 2;</code>
   */
  com.google.protobuf.ByteString
      getInfoUrlBytes();

  /**
   * <code>string title = 3;</code>
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 3;</code>
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>string desc = 4;</code>
   */
  java.lang.String getDesc();
  /**
   * <code>string desc = 4;</code>
   */
  com.google.protobuf.ByteString
      getDescBytes();

  /**
   * <code>.image.common.ImageType type = 5;</code>
   */
  int getTypeValue();
  /**
   * <code>.image.common.ImageType type = 5;</code>
   */
  org.ditto.sexyimage.common.grpc.ImageType getType();

  /**
   * <code>int64 lastUpdated = 6;</code>
   */
  long getLastUpdated();

  /**
   * <code>bool active = 7;</code>
   */
  boolean getActive();
}
