plugins {
    alias(libs.plugins.android.application)
    kotlin("android")
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
}
android {
    namespace = "com.delta.playandroid"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.delta.playandroid"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildFeatures{
        dataBinding = true
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    // 拦截器logger
    implementation(libs.logging.interceptor)

    // paging3 分页加载库
    implementation(libs.androidx.paging.runtime)
    implementation(libs.androidx.paging.runtime.ktx)

    // Hilt
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    // Glide 图片加载库
    implementation(libs.glide)
    implementation(libs.glideCompiler)

    // flexbox 适配卡片布局
    implementation(libs.google.flexbox)

    // androidx 库
    implementation(libs.androidx.datastore)
    implementation(libs.androidx.cardview)
    implementation(libs.androidx.viewpager2)
    implementation(libs.androidx.fragment.fragment.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // material 库
    implementation(libs.com.google.android.material.material.v140)

    // retrofit 库
    implementation(libs.retrofit)

    // gson库
    implementation (libs.com.squareup.retrofit2.converter.gson6)

    // rxjava2 库
    implementation (libs.adapter.rxjava2)

    // kotlin 协程库
    implementation(libs.jetbrains.kotlinx.coroutines.android)

    // junit 测试库
    testImplementation(libs.junit)

    // Datastore 库
    implementation(libs.androidx.datastore.datastore.preferences)
}

kapt{
    correctErrorTypes = true
}