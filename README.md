# Note APP

This project's primary goal was to learn and gain experience building apps with Jetpack Compose. As part of this learning process, we explored the use of ROOM for data persistence and dependency injection for managing object dependencies.

## Some concepts

* Room: the Room persistence library provides an abstraction layer over SQLite to allow for more robust database access while harnessing the full power of SQLite.

* Dependency Injection: An object that another object requires to function. We used **Hilt** in this project. Why? Because...

    * Reusability of code
    * Ease of refactoring
    * Ease of testing
  
## ROOM Database

![developer.android.com](https://developer.android.com/static/codelabs/android-room-with-a-view-kotlin/img/8e4b761713e3a76b_1440.png)

## Installation

If you want to install the App and use it, please follow the next steps:

* Install [Android Studio](https://developer.android.com/studio)
* Create a new project (File > New > New Project > Emptity Activity) 
* Select API 26 ("Oreo"; Android 8.0)

Add these dependencies into your build.gradle.kts (Project)

```kotlin
  plugins {
    ...

    // Hilt - Dagger
    id("com.google.dagger.hilt.android") version "2.44" apply false
    kotlin("kapt") version "1.8.20"
}
```

Add these dependencies into your build.gradle.kts (Module)

```kotlin
  plugins {
    ...

    // This is for Hilt - Dagger
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

...

// We're using Java 17
compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlinOptions {
    jvmTarget = "17"
}

...

composeOptions {
    // This is really important for Hilt compatibility
     kotlinCompilerExtensionVersion = "1.4.5"
}

...

// The most important part
dependencies {
    ...

    // ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose-android:2.8.0-alpha04")

    // Hilt - Dagger
    implementation("com.google.dagger:hilt-android:2.51.1")
    kapt("com.google.dagger:hilt-android-compiler:2.51.1")
    kapt("androidx.hilt:hilt-compiler:1.2.0")
    implementation("androidx.hilt:hilt-navigation-compose:1.2.0")

    // ROOM
    implementation("androidx.room:room-runtime:2.6.1")
    kapt("androidx.room:room-compiler:2.6.1")

    // Optional - Kotlin Extensions and Coroutines support for Room
    implementation("androidx.room:room-ktx:2.6.1")

    // Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.7.3")

    implementation("androidx.compose.compiler:compiler:1.5.11")
}

kapt {
    correctErrorTypes = true
}
```

Finally "Sync Now", connect your phone, run it and enjoy it!

## Preview Screen

<img src="https://github.com/JGaldo-beep/Jetpack-Compose-NoteApp/assets/80436377/fe8209f5-569a-43c3-aeb5-ff50667019fc" width="250" />
