package com.example.messaging.build.logic

import org.gradle.api.Plugin
import org.gradle.api.Project


class CoreConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.library")
                apply("kotlin-android")
            }

        }
    }

}
