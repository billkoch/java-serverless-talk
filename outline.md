# Micronaut/GraalVM Talk

## Topics
1. Why is Java and Spring Boot (by themselves) not particularly well suited for serverless architecures?
    1. Slow JVM startup time
    1. Spring Boot's use of reflection to wire up beans
1. Introduce Graal
    1. What is it?
        1. An optional JIT compiler (via JVMCI) available in OpenJDK 9+
            1. HotSpot C1, C2 compilers
                1. Written in C++
                1. Tiered compilation mode is the default
            1. Graal compiler
                1. Written in Java
                1. Prior to 19.1 packaged as jargraal, which meant the compiler itself will be jit-ed, polluted application's heap, etc. ...
                1. libgraal is a the Graal compiler that has been AOT compiled into a native image
        1. GraalVM (not just the compiler) is a polyglot VM (enabling Ruby, Node, Python, etc.) via Truffle + Graal compiler
        1. Native image plugin that AOT compiles Java byte code into machine code
1. Graal native-image plugin
    1. Runs on the SubstrateVM to perform AOT compilation analysis
