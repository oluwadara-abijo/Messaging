plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.org.jetbrains.kotlin.android)

}

android {
    namespace = "com.example.messaging"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.messaging"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    val composeBom = platform(libs.compose.bom)
    implementation(composeBom)
    androidTestImplementation(composeBom)

    implementation(libs.material)
    implementation(libs.google.fonts)
    implementation(libs.activity.compose)
    implementation(libs.viewmodel.compose)
    implementation(libs.lifecycle.runtime.ktx)
    implementation(libs.compose.foundation)
    implementation(libs.compose.preview)
    implementation(libs.core.ktx)
    implementation(libs.koin.core)
    implementation(libs.koin.android)

    testImplementation(libs.junit)

    androidTestImplementation(libs.test.ext.junit)

    debugImplementation(libs.compose.preview.debug)
}
