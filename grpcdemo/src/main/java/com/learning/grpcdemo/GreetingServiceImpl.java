package com.learning.grpcdemo;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class GreetingServiceImpl extends GreetingServiceGrpc.GreetingServiceImplBase{

    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        String name = request.getName();
        String message = "Hello, "+name;

        HelloResponse response = HelloResponse.newBuilder().setMessage(message).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
