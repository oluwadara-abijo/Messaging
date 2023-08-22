plugins {
    `kotlin-dsl`
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidCore") {
            id = "com.example.messaging.core"
            implementationClass = "CoreConventionPlugin"
        }
    }
}
