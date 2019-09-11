# Graal Native Example

## Tooling
1. [sdkman!](https://sdkman.io/install)

## Building
```bash
sdk install java 12.0.2-open
./gradlew buildDockerImage
```
> :bulb: This will leverage a Docker multi-stage build to produce a Graal native image, and package it up as a Docker image
>
> :star: Check out that small image size!

## Running
```bash
docker run java-serverless-talk/hello-graal-native:0.0.1
```