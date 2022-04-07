plugins {
    id("com.android.application")
    id("com.google.android.gms.oss-licenses-plugin")
    id("com.google.gms.google-services")
    id("com.google.firebase.crashlytics")
    kotlin("android")
    id("kotlin-parcelize")
}

setupApp()

android.defaultConfig.applicationId = "com.github.yellowvpn"

dependencies {
    val cameraxVersion = "1.0.1"
    implementation(project(":nativetemplates"))
    implementation("com.google.android.gms:play-services-ads:20.5.0")
    implementation("androidx.browser:browser:1.3.0")
    implementation("androidx.camera:camera-camera2:$cameraxVersion")
    implementation("androidx.camera:camera-lifecycle:$cameraxVersion")
    implementation("androidx.camera:camera-view:1.0.0-alpha28")
    implementation("androidx.constraintlayout:constraintlayout:2.1.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion")
    implementation("com.google.mlkit:barcode-scanning:17.0.0")
    implementation("com.google.zxing:core:3.4.1")
    implementation("com.takisoft.preferencex:preferencex-simplemenu:1.1.0")
    implementation("com.twofortyfouram:android-plugin-api-for-locale:1.0.4")
    implementation("me.zhanghai.android.fastscroll:library:1.1.7")

    implementation(platform("com.google.firebase:firebase-bom:29.2.0"))
    implementation("com.google.firebase:firebase-analytics-ktx")
}
