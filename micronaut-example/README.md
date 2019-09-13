# Micronaut Example

## Tooling
1. [sdkman!](https://sdkman.io/install)

## Building
```bash
sdk install java 19.2.0-grl
sdk use java 19.2.0-grl

# install the native-image addon
gu install native-image

./gradlew buildDockerImage
```

## Running Micronaut in the JVM
```bash
# Start Micronaut application (embedded Tomcat) listening on :8080
./gradlew run

# Hit the REST API
curl -i http://localhost:8080
```

## Running Micronaut as a Graal native-image
```bash
./gradlew assemble

# This will take a bit, so it'd be a good time to get a coffee...
native-image --no-server -cp build/libs/micronaut-example-0.1-all.jar

./micronaut-example
```
