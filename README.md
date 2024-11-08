# gRPC API with Spring Boot

This project demonstrates a simple gRPC-based API built using Spring Boot. It provides a setup to run gRPC services, leveraging Spring Boot’s integration with gRPC to manage endpoints and service layers.

## Getting Started

### Prerequisites

Ensure you have the following installed:

- Java JDK 11+
- Maven 3.6+
- grpcurl (for testing the API)

### Running the Project Locally

1. Clone the Repository:

>git clone https://github.com/yourusername/grpc-springboot-demo.git
cd grpc-springboot-demo


2. Build the Project:

Navigate to the project directory and build it using Maven:

>mvn clean install

3. Run the Application:

Once the build is successful, run the Spring Boot application:

>mvn spring-boot:run

The application will start on the default port (typically 8080 for HTTP endpoints) and the configured gRPC port (e.g., 9090 for gRPC endpoints).

### Accessing the gRPC API Using grpcurl

1. Install grpcurl:

Follow the installation instructions for your operating system [here](https://github.com/fullstorydev/grpcurl#installation).

2.	Using grpcurl to Test the API:

With the Spring Boot application running, you can use grpcurl to make requests to the gRPC service. Replace <your-service-name> with the name of your gRPC service (found in your .proto file), and <method-name> with the method you want to call.

>grpcurl -plaintext -d '{ "yourField": "value" }' localhost:9090 <your-service-name>/<method-name>

Example usage:

>grpcurl -plaintext -d '{ "name": "John Doe" }' localhost:9090 com.example.GreeterService/SayHello

Note: Make sure to replace the service and method names with the ones defined in your .proto file.

### Project Structure

- src/main/java: Contains the Java source files for controllers, services, and gRPC-related classes.
- /main/resources: Configuration files and application properties.

### Configuration

Configure the application properties (if necessary) by editing the src/main/resources/application.properties file. You can adjust port settings or other configurations as needed.

This should guide users on how to access your gRPC Spring Boot API using grpcurl. Let me know if there’s anything more you’d like to include!