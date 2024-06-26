// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.8.20" apply false

    // Migrating to KSP for ROOM
    id("com.google.devtools.ksp") version "1.8.10-1.0.9" apply false

    // Hilt - Dagger
    id("com.google.dagger.hilt.android") version "2.44" apply false
    kotlin("kapt") version "1.8.20"
}
