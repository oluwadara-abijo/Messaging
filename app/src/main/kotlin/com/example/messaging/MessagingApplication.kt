package com.example.messaging

import android.app.Application
import com.example.messaging.di.injectApplication

class MessagingApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        injectApplication()
    }
}
