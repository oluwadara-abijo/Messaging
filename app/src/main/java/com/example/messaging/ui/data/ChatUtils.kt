package com.example.messaging.ui.data

import com.example.messaging.R
import com.example.messaging.ui.model.Chat
import com.example.messaging.ui.model.Message
import com.example.messaging.ui.model.Sender

fun getAllChats(): List<Chat> {
    return listOf(
        Chat(
            sender = Sender(name = "Bryan", picture = R.drawable.ic_bryan),
            messages = listOf(
                Message("I like that one", "4:28 PM"),
                Message("What do you think?", "4:30 PM")
            ),
            unreadCount = 2
        ),
        Chat(
            sender = Sender(name = "Kari", picture = R.drawable.ic_kari),
            messages = listOf(
                Message("Looks great!", "4:23 PM")
            ),
            unreadCount = 1
        ),
        Chat(
            sender = Sender(name = "Diana", picture = R.drawable.ic_diana),
            messages = listOf(
                Message("Lunch on Monday?", "4:12 PM")
            ),
        ),
        Chat(
            sender = Sender(name = "Ben", picture = R.drawable.ic_ben),
            messages = listOf(
                Message("You sent a photo", "3:58 PM")
            ),
        ),
        Chat(
            sender = Sender(name = "Naomi", picture = R.drawable.ic_naomi),
            messages = listOf(
                Message("Naomi sent a photo", "3:31 PM")
            ),
        ),
        Chat(
            sender = Sender(name = "Alicia", picture = R.drawable.ic_alicia),
            messages = listOf(
                Message("See you at 8", "3:30 PM")
            ),
        )
    )

}