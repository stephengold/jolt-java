pluginManagement {
    plugins {
        kotlin("jvm") version "1.8.0"
        id("org.jetbrains.dokka") version "1.7.20"
    }
}

rootProject.name = "jolt-jni"

listOf(
    "natives-linux",
    "test"
).forEach {
    val name = "${rootProject.name}-$it"
    include(name)
    project(":$name").apply {
        projectDir = file(it)
    }
}
