plugins {
    alias(libs.plugins.gradleversioncatalogssample.android.library)
}

android {
    namespace = "com.nikosgig.feature1"
}

dependencies {

    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
