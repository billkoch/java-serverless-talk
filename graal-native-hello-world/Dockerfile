FROM openjdk:8u222-jdk-slim as gradle-build
WORKDIR /tmp
RUN apt-get update && \
    apt-get install -y build-essential zlib1g-dev
COPY . /tmp
RUN ./gradlew assemble nativeImage

FROM scratch
ENTRYPOINT [ "/tmp/hello-world" ]
COPY --from=gradle-build /tmp/build/graal /tmp/
