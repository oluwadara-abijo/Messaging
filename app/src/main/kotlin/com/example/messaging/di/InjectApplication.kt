package com.example.messaging.di

import com.example.messaging.MessagingApplication
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.module.Module


fun injectApplication() {
    startKoin {
        androidLogger()
        androidContext(MessagingApplication())
        modules(coreModules())
    }
}

private fun coreModules(): List<Module> = listOf()
