import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

plugins {
    kotlin("multiplatform") version "2.0.20"
    `maven-publish`

}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(8)

    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        nodejs()
    }
}