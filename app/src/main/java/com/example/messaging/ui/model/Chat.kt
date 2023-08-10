package com.example.messaging.ui.model

data class Chat(val sender: Sender, val messages: List<Message>, val unreadCount: Int = 0)
