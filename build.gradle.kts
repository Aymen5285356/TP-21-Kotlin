// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    id("org.jetbrains.dokka") version "2.2.0"
}

tasks.register("helloGradle") {
    doLast {
        println("Hello from Gradle!")

    }
}
