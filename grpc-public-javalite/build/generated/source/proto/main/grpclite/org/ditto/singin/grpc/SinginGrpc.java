package org.ditto.singin.grpc;

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
    comments = "Source: image/public/singin.proto")
public final class SinginGrpc {

  private SinginGrpc() {}

  public static final String SERVICE_NAME = "image.public.Singin";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.ditto.singin.grpc.SignInRequest,
      org.ditto.singin.grpc.SignInResponse> METHOD_SIGN_IN =
      io.grpc.MethodDescriptor.<org.ditto.singin.grpc.SignInRequest, org.ditto.singin.grpc.SignInResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "image.public.Singin", "SignIn"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              org.ditto.singin.grpc.SignInRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              org.ditto.singin.grpc.SignInResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SinginStub newStub(io.grpc.Channel channel) {
    return new SinginStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SinginBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SinginBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SinginFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SinginFutureStub(channel);
  }

  /**
   * <pre>
   * The image service definition.
   * </pre>
   */
  public static abstract class SinginImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sign-in the user
     * </pre>
     */
    public void signIn(org.ditto.singin.grpc.SignInRequest request,
        io.grpc.stub.StreamObserver<org.ditto.singin.grpc.SignInResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SIGN_IN, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SIGN_IN,
            asyncUnaryCall(
              new MethodHandlers<
                org.ditto.singin.grpc.SignInRequest,
                org.ditto.singin.grpc.SignInResponse>(
                  this, METHODID_SIGN_IN)))
          .build();
    }
  }

  /**
   * <pre>
   * The image service definition.
   * </pre>
   */
  public static final class SinginStub extends io.grpc.stub.AbstractStub<SinginStub> {
    private SinginStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SinginStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SinginStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SinginStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sign-in the user
     * </pre>
     */
    public void signIn(org.ditto.singin.grpc.SignInRequest request,
        io.grpc.stub.StreamObserver<org.ditto.singin.grpc.SignInResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SIGN_IN, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The image service definition.
   * </pre>
   */
  public static final class SinginBlockingStub extends io.grpc.stub.AbstractStub<SinginBlockingStub> {
    private SinginBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SinginBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SinginBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SinginBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sign-in the user
     * </pre>
     */
    public org.ditto.singin.grpc.SignInResponse signIn(org.ditto.singin.grpc.SignInRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SIGN_IN, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The image service definition.
   * </pre>
   */
  public static final class SinginFutureStub extends io.grpc.stub.AbstractStub<SinginFutureStub> {
    private SinginFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SinginFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SinginFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SinginFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sign-in the user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.ditto.singin.grpc.SignInResponse> signIn(
        org.ditto.singin.grpc.SignInRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SIGN_IN, getCallOptions()), request);
    }
  }

  private static final int METHODID_SIGN_IN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SinginImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SinginImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIGN_IN:
          serviceImpl.signIn((org.ditto.singin.grpc.SignInRequest) request,
              (io.grpc.stub.StreamObserver<org.ditto.singin.grpc.SignInResponse>) responseObserver);
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
      synchronized (SinginGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(METHOD_SIGN_IN)
              .build();
        }
      }
    }
    return result;
  }
}
