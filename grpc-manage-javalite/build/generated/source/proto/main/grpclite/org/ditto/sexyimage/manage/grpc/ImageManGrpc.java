package org.ditto.sexyimage.manage.grpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * The image service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.6.1)",
    comments = "Source: image/manage/imageman.proto")
public final class ImageManGrpc {

  private ImageManGrpc() {}

  public static final String SERVICE_NAME = "image.manage.ImageMan";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.ditto.sexyimage.manage.grpc.ListRequest,
      org.ditto.sexyimage.common.grpc.ImageResponse> METHOD_LIST =
      io.grpc.MethodDescriptor.<org.ditto.sexyimage.manage.grpc.ListRequest, org.ditto.sexyimage.common.grpc.ImageResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "image.manage.ImageMan", "List"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              org.ditto.sexyimage.manage.grpc.ListRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              org.ditto.sexyimage.common.grpc.ImageResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.ditto.sexyimage.manage.grpc.DeleteRequest,
      org.ditto.sexyimage.common.grpc.StatusResponse> METHOD_DELETE =
      io.grpc.MethodDescriptor.<org.ditto.sexyimage.manage.grpc.DeleteRequest, org.ditto.sexyimage.common.grpc.StatusResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "image.manage.ImageMan", "Delete"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              org.ditto.sexyimage.manage.grpc.DeleteRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              org.ditto.sexyimage.common.grpc.StatusResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.ditto.sexyimage.manage.grpc.UpsertRequest,
      org.ditto.sexyimage.common.grpc.StatusResponse> METHOD_UPSERT =
      io.grpc.MethodDescriptor.<org.ditto.sexyimage.manage.grpc.UpsertRequest, org.ditto.sexyimage.common.grpc.StatusResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "image.manage.ImageMan", "Upsert"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              org.ditto.sexyimage.manage.grpc.UpsertRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              org.ditto.sexyimage.common.grpc.StatusResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImageManStub newStub(io.grpc.Channel channel) {
    return new ImageManStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImageManBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ImageManBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImageManFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ImageManFutureStub(channel);
  }

  /**
   * <pre>
   * The image service definition.
   * </pre>
   */
  public static abstract class ImageManImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * A server-to-client streaming RPC.
     * Obtains images whose types are the given normal/poster/sexy/porn.  Results are
     * streamed rather than returned at once (e.g. in a response message with a
     * repeated field), as the lastUpsertd maybe an very old time and contain a
     * huge number of images.
     * </pre>
     */
    public void list(org.ditto.sexyimage.manage.grpc.ListRequest request,
        io.grpc.stub.StreamObserver<org.ditto.sexyimage.common.grpc.ImageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST, responseObserver);
    }

    /**
     */
    public void delete(org.ditto.sexyimage.manage.grpc.DeleteRequest request,
        io.grpc.stub.StreamObserver<org.ditto.sexyimage.common.grpc.StatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE, responseObserver);
    }

    /**
     */
    public void upsert(org.ditto.sexyimage.manage.grpc.UpsertRequest request,
        io.grpc.stub.StreamObserver<org.ditto.sexyimage.common.grpc.StatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPSERT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST,
            asyncServerStreamingCall(
              new MethodHandlers<
                org.ditto.sexyimage.manage.grpc.ListRequest,
                org.ditto.sexyimage.common.grpc.ImageResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            METHOD_DELETE,
            asyncUnaryCall(
              new MethodHandlers<
                org.ditto.sexyimage.manage.grpc.DeleteRequest,
                org.ditto.sexyimage.common.grpc.StatusResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            METHOD_UPSERT,
            asyncUnaryCall(
              new MethodHandlers<
                org.ditto.sexyimage.manage.grpc.UpsertRequest,
                org.ditto.sexyimage.common.grpc.StatusResponse>(
                  this, METHODID_UPSERT)))
          .build();
    }
  }

  /**
   * <pre>
   * The image service definition.
   * </pre>
   */
  public static final class ImageManStub extends io.grpc.stub.AbstractStub<ImageManStub> {
    private ImageManStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImageManStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageManStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImageManStub(channel, callOptions);
    }

    /**
     * <pre>
     * A server-to-client streaming RPC.
     * Obtains images whose types are the given normal/poster/sexy/porn.  Results are
     * streamed rather than returned at once (e.g. in a response message with a
     * repeated field), as the lastUpsertd maybe an very old time and contain a
     * huge number of images.
     * </pre>
     */
    public void list(org.ditto.sexyimage.manage.grpc.ListRequest request,
        io.grpc.stub.StreamObserver<org.ditto.sexyimage.common.grpc.ImageResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(org.ditto.sexyimage.manage.grpc.DeleteRequest request,
        io.grpc.stub.StreamObserver<org.ditto.sexyimage.common.grpc.StatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void upsert(org.ditto.sexyimage.manage.grpc.UpsertRequest request,
        io.grpc.stub.StreamObserver<org.ditto.sexyimage.common.grpc.StatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPSERT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The image service definition.
   * </pre>
   */
  public static final class ImageManBlockingStub extends io.grpc.stub.AbstractStub<ImageManBlockingStub> {
    private ImageManBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImageManBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageManBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImageManBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * A server-to-client streaming RPC.
     * Obtains images whose types are the given normal/poster/sexy/porn.  Results are
     * streamed rather than returned at once (e.g. in a response message with a
     * repeated field), as the lastUpsertd maybe an very old time and contain a
     * huge number of images.
     * </pre>
     */
    public java.util.Iterator<org.ditto.sexyimage.common.grpc.ImageResponse> list(
        org.ditto.sexyimage.manage.grpc.ListRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_LIST, getCallOptions(), request);
    }

    /**
     */
    public org.ditto.sexyimage.common.grpc.StatusResponse delete(org.ditto.sexyimage.manage.grpc.DeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE, getCallOptions(), request);
    }

    /**
     */
    public org.ditto.sexyimage.common.grpc.StatusResponse upsert(org.ditto.sexyimage.manage.grpc.UpsertRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPSERT, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The image service definition.
   * </pre>
   */
  public static final class ImageManFutureStub extends io.grpc.stub.AbstractStub<ImageManFutureStub> {
    private ImageManFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImageManFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageManFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImageManFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.ditto.sexyimage.common.grpc.StatusResponse> delete(
        org.ditto.sexyimage.manage.grpc.DeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.ditto.sexyimage.common.grpc.StatusResponse> upsert(
        org.ditto.sexyimage.manage.grpc.UpsertRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPSERT, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_DELETE = 1;
  private static final int METHODID_UPSERT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ImageManImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImageManImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((org.ditto.sexyimage.manage.grpc.ListRequest) request,
              (io.grpc.stub.StreamObserver<org.ditto.sexyimage.common.grpc.ImageResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((org.ditto.sexyimage.manage.grpc.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<org.ditto.sexyimage.common.grpc.StatusResponse>) responseObserver);
          break;
        case METHODID_UPSERT:
          serviceImpl.upsert((org.ditto.sexyimage.manage.grpc.UpsertRequest) request,
              (io.grpc.stub.StreamObserver<org.ditto.sexyimage.common.grpc.StatusResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ImageManGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(METHOD_LIST)
              .addMethod(METHOD_DELETE)
              .addMethod(METHOD_UPSERT)
              .build();
        }
      }
    }
    return result;
  }
}
