package com.example.messaging.ui.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.messaging.ui.components.ChatRow
import com.example.messaging.ui.components.Screen
import com.example.messaging.ui.data.getAllChats
import com.example.messaging.ui.theme.MessagingTheme

@Composable
fun ChatsScreen() {
    val chats = getAllChats() + getAllChats() + getAllChats()
    Screen(modifier = Modifier) {
        LazyColumn {
            items(chats) { chat ->
                ChatRow(chat = chat)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ChatPreview() {
    MessagingTheme {
        ChatsScreen()
    }
}
