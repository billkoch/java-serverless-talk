# Graal JIT Example

## Tooling
1. [sdkman!](https://sdkman.io/install)

## Building
```bash
sdk install java 12.0.2-open
./gradlew build
```
> The Graal JIT compiler is pre-packaged in OpenJDK starting with 10.0.2

## Running With Plain Java
```bash
java -jar build/libs/graal-jit-example-0.0.1.jar 'Ray. If someone asks if you are a god, you say, "yes!"'
```

## Running With Plain Java + Graal JIT Compiler
```bash
java \
    -XX:+UnlockExperimentalVMOptions \
    -XX:+EnableJVMCI \
    -XX:+UseJVMCICompiler \
    -jar build/libs/graal-jit-example-0.0.1.jar 'Ray. If someone asks if you are a god, you say, "yes!"'
```

To see the Graal JIT compiler is actually being used, add `-XX:+PrintCompilation`:
```bash
java \
    -XX:+PrintCompilation \
    -XX:+UnlockExperimentalVMOptions \
    -XX:+EnableJVMCI \
    -XX:+UseJVMCICompiler \
    -jar build/libs/graal-jit-example-0.0.1.jar 'Ray. If someone asks if you are a god, you say, "yes!"'
```
> You see a whole bunch of output including references to the `org.graalvm.compiler.*` package

## Running With GraalVM + libgraal
```bash
sdk install java 19.2.0-grl
sdk use java 19.2.0-grl
```

`libgraal` is enabled by default on GraalVM 19.1.0+, so running the example is simply:
```bash
# libgraal is enabled by default
java -jar build/libs/graal-jit-example-0.0.1.jar 'Ray. If someone asks if you are a god, you say, "yes!"'
```

To compare with `jargraal`:
```bash
java \
    -XX:-UseJVMCINativeLibrary \
    -jar build/libs/graal-jit-example-0.0.1.jar 'Ray. If someone asks if you are a god, you say, "yes!"'
```
