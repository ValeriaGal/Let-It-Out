plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.letitout_android"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.letitout_android"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    packagingOptions {
        exclude("META-INF/DEPENDENCIES")
        exclude("META-INF/LICENSE.md")
        exclude("META-INF/NOTICE.md")
        exclude ("mozilla/public-suffix-list.txt")
    }
}
dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.5.0")
    implementation("com.squareup.okhttp3:okhttp:4.9.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.activity:activity:1.7.0")
    implementation("com.google.firebase:firebase-firestore:25.0.0")
    implementation("com.google.firebase:firebase-storage:21.0.0")
    testImplementation("junit:junit:4.13.2")

    implementation("com.firebaseui:firebase-ui-firestore:8.0.2")
    implementation("com.google.firebase:firebase-messaging-ktx:24.0.0")

    //sdk aws
    implementation ("com.amazonaws:aws-android-sdk-s3:2.19.3")
    implementation ("com.amazonaws:aws-android-sdk-mobile-client:2.19.3")

    // Amplify core dependency
    implementation ("com.amplifyframework:core:1.6.4")

    // Support for Java 8 features
    coreLibraryDesugaring ("com.android.tools:desugar_jdk_libs:2.0.4")
    implementation ("com.amplifyframework:aws-storage-s3:1.6.4")
    implementation ("com.amplifyframework:aws-auth-cognito:1.6.4")

    //Glide
    implementation ("com.github.bumptech.glide:glide:4.12.0")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.12.0")

    //graficas
    implementation ("com.github.PhilJay:MPAndroidChart:v3.1.0")

    //twilio
    implementation ("com.twilio.sdk:twilio:10.1.3")
    implementation("net.sourceforge.htmlunit:htmlunit-android:2.63.0")

    implementation ("com.google.code.gson:gson:2.10.1")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation(platform("org.jetbrains.kotlin:kotlin-bom:1.8.0"))
    implementation ("com.amazonaws:aws-android-sdk-s3:2.25.0")
    implementation ("androidx.work:work-runtime:2.9.0")
    implementation ("com.google.guava:guava:31.1-android")
}