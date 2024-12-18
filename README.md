<div align="center">

# JoltJava

Java bindings for [JoltPhysics](https://github.com/jrouwe/JoltPhysics) with C bindings based on
[zig-gamedev JoltPhysicsC](https://github.com/michal-z/zig-gamedev/tree/main/libs/zphysics/libs)

</div>

# This project is no longer being developed.

# The bindings are feature-incomplete and unstable.

# Please use [jolt-jni](https://github.com/stephengold/jolt-jni) instead.

## Coverage

Features:
- [x] Rigid bodies
  - [x] Body interface
  - [x] Body locking
  - [x] Motion properties
- [x] Shapes
  - [x] Convex
  - [x] Compound
  - [x] Decorator
  - [x] Mesh/height field
- [x] Queries
  - [x] Broad phase
  - [x] Narrow phase
- [x] Listeners
  - [x] Step
  - [x] Contact
- [x] Double precision
- [ ] Constraints
  - [x] Two-body constraints
- [ ] Vehicles
- [ ] Ragdolls
- [ ] Characters

Platforms:
- [x] Linux (x86_64)
- [ ] Windows (x86_64)
- [ ] MacOS (x86_64)

Build types (change with Gradle flag `-PbuildType=` or property `buildType`):
- `debug`
- `release`
- `distribution` (default)

Flavors (change with Gradle flag `-PbuildFlavor=` or property `buildFlavor`):
- `sp` (single-precision floating point, default)
- `dp` (double-precision floating point)

## Usage

```kotlin
repositories {
    mavenCentral()
}

dependencies {
    implementation("com.github.stephengold", "jolt-java", "0.1.0")
    runtimeOnly("com.github.stephengold", "jolt-java-natives-linux-x86", "0.1.0")
}
```

Usage is very similar to JoltPhysics. See [HelloJolt.java](src/test/java/jolt/HelloJolt.java) to get a
minimal implementation.

**Note:** these bindings are fairly low-level. For some classes such as the vector and matrix classes, you are expected
to write your own wrappers around them.

### Setup

```java
// Load the native libraries from the jar (in `jolt/`)
Jolt.load();
// Or load them manually
// System.load("name-of-lib-file");

// Do some Jolt setup
Jolt.registerDefaultAllocator();
Jolt.createFactory();
Jolt.registerTypes();
```

## Building from source

On Windows, you need [Ninja](https://ninja-build.org/manual.html) installed.

```sh
git clone https://github.com/stephengold/jolt-java
cd jolt-java
./gradlew build
```
