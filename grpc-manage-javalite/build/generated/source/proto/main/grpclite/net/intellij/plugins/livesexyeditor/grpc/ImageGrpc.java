package net.intellij.plugins.livesexyeditor.grpc;

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
    comments = "Source: image/public/image.proto")
public final class ImageGrpc {

  private ImageGrpc() {}

  public static final String SERVICE_NAME = "image.public.Image";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest,
      org.ditto.sexyimage.common.grpc.ImageResponse> METHOD_SUBSCRIBE =
      io.grpc.MethodDescriptor.<net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest, org.ditto.sexyimage.common.grpc.ImageResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "image.public.Image", "Subscribe"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              org.ditto.sexyimage.common.grpc.ImageResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<net.intellij.plugins.livesexyeditor.grpc.VisitRequest,
      net.intellij.plugins.livesexyeditor.grpc.VisitResponse> METHOD_VISIT =
      io.grpc.MethodDescriptor.<net.intellij.plugins.livesexyeditor.grpc.VisitRequest, net.intellij.plugins.livesexyeditor.grpc.VisitResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "image.public.Image", "Visit"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              net.intellij.plugins.livesexyeditor.grpc.VisitRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              net.intellij.plugins.livesexyeditor.grpc.VisitResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImageStub newStub(io.grpc.Channel channel) {
    return new ImageStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ImageBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ImageFutureStub(channel);
  }

  /**
   * <pre>
   * The image service definition.
   * </pre>
   */
  public static abstract class ImageImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * A server-to-client streaming RPC.
     * Obtains images whose types are the given normal/poster/sexy/porn.  Results are
     * streamed rather than returned at once (e.g. in a response message with a
     * repeated field), as the lastUpdated maybe an very old time and contain a
     * huge number of images.
     * </pre>
     */
    public void subscribe(net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest request,
        io.grpc.stub.StreamObserver<org.ditto.sexyimage.common.grpc.ImageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SUBSCRIBE, responseObserver);
    }

    /**
     */
    public void visit(net.intellij.plugins.livesexyeditor.grpc.VisitRequest request,
        io.grpc.stub.StreamObserver<net.intellij.plugins.livesexyeditor.grpc.VisitResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_VISIT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SUBSCRIBE,
            asyncServerStreamingCall(
              new MethodHandlers<
                net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest,
                org.ditto.sexyimage.common.grpc.ImageResponse>(
                  this, METHODID_SUBSCRIBE)))
          .addMethod(
            METHOD_VISIT,
            asyncUnaryCall(
              new MethodHandlers<
                net.intellij.plugins.livesexyeditor.grpc.VisitRequest,
                net.intellij.plugins.livesexyeditor.grpc.VisitResponse>(
                  this, METHODID_VISIT)))
          .build();
    }
  }

  /**
   * <pre>
   * The image service definition.
   * </pre>
   */
  public static final class ImageStub extends io.grpc.stub.AbstractStub<ImageStub> {
    private ImageStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImageStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImageStub(channel, callOptions);
    }

    /**
     * <pre>
     * A server-to-client streaming RPC.
     * Obtains images whose types are the given normal/poster/sexy/porn.  Results are
     * streamed rather than returned at once (e.g. in a response message with a
     * repeated field), as the lastUpdated maybe an very old time and contain a
     * huge number of images.
     * </pre>
     */
    public void subscribe(net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest request,
        io.grpc.stub.StreamObserver<org.ditto.sexyimage.common.grpc.ImageResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_SUBSCRIBE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void visit(net.intellij.plugins.livesexyeditor.grpc.VisitRequest request,
        io.grpc.stub.StreamObserver<net.intellij.plugins.livesexyeditor.grpc.VisitResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_VISIT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The image service definition.
   * </pre>
   */
  public static final class ImageBlockingStub extends io.grpc.stub.AbstractStub<ImageBlockingStub> {
    private ImageBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImageBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImageBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * A server-to-client streaming RPC.
     * Obtains images whose types are the given normal/poster/sexy/porn.  Results are
     * streamed rather than returned at once (e.g. in a response message with a
     * repeated field), as the lastUpdated maybe an very old time and contain a
     * huge number of images.
     * </pre>
     */
    public java.util.Iterator<org.ditto.sexyimage.common.grpc.ImageResponse> subscribe(
        net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_SUBSCRIBE, getCallOptions(), request);
    }

    /**
     */
    public net.intellij.plugins.livesexyeditor.grpc.VisitResponse visit(net.intellij.plugins.livesexyeditor.grpc.VisitRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_VISIT, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The image service definition.
   * </pre>
   */
  public static final class ImageFutureStub extends io.grpc.stub.AbstractStub<ImageFutureStub> {
    private ImageFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImageFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImageFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.intellij.plugins.livesexyeditor.grpc.VisitResponse> visit(
        net.intellij.plugins.livesexyeditor.grpc.VisitRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_VISIT, getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBSCRIBE = 0;
  private static final int METHODID_VISIT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ImageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBSCRIBE:
          serviceImpl.subscribe((net.intellij.plugins.livesexyeditor.grpc.SubscribeRequest) request,
              (io.grpc.stub.StreamObserver<org.ditto.sexyimage.common.grpc.ImageResponse>) responseObserver);
          break;
        case METHODID_VISIT:
          serviceImpl.visit((net.intellij.plugins.livesexyeditor.grpc.VisitRequest) request,
              (io.grpc.stub.StreamObserver<net.intellij.plugins.livesexyeditor.grpc.VisitResponse>) responseObserver);
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
      synchronized (ImageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(METHOD_SUBSCRIBE)
              .addMethod(METHOD_VISIT)
              .build();
        }
      }
    }
    return result;
  }
}
