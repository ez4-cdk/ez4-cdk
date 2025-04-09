plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    kotlin("kapt")
}

android {
    namespace = "com.delta.deepread"
    compileSdk = 34


    defaultConfig {
        applicationId = "com.delta.deepread"
        minSdk = 28
        targetSdk = 34
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
        compose = false
        viewBinding = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(libs.retrofit)
    implementation(libs.okhttp)
    implementation(libs.gson.converter)

    implementation(libs.androidx.paging.runtime.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.fragment.ktx.v161)
    implementation(libs.androidx.room.room.runtime3)
    //noinspection KaptUsageInsteadOfKsp
    kapt(libs.androidx.room.compiler)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.material)

    implementation(libs.cardview)

    implementation(libs.constraintlayout)

    implementation(libs.glide)
    implementation(libs.glideCompiler)

    implementation(libs.viewpager2)

    implementation(libs.flexbox)

    implementation(libs.mp3agic)
}