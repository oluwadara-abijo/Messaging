package com.example.messaging.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.messaging.ui.data.getAllChats
import com.example.messaging.ui.model.Chat
import com.example.messaging.ui.theme.Dimens.DefaultPadding
import com.example.messaging.ui.theme.Dimens.DefaultPaddingQuarter
import com.example.messaging.ui.theme.Dimens.DefaultPaddingSmall
import com.example.messaging.ui.theme.Dimens.PaddingSmall
import com.example.messaging.ui.theme.Dimens.ProfilePictureSize
import com.example.messaging.ui.theme.LightBlue
import com.example.messaging.ui.theme.MessagingTheme
import com.example.messaging.ui.theme.PrimaryText
import com.example.messaging.ui.theme.SecondaryText

@Composable
fun ChatRow(chat: Chat) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = PaddingSmall),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            painter = painterResource(id = chat.sender.picture),
            contentDescription = "Profile picture",
            modifier = Modifier
                .size(ProfilePictureSize)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .padding(start = DefaultPadding, end = DefaultPadding),
        ) {
            Text(
                text = chat.sender.name,
                color = PrimaryText,
                style = MaterialTheme.typography.bodyLarge
            )
            Spacer(modifier = Modifier.padding(DefaultPaddingQuarter))
            Text(
                text = chat.messages.last().message,
                color = SecondaryText,
                style = MaterialTheme.typography.bodyMedium
            )
        }
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterEnd) {
            Column(horizontalAlignment = Alignment.End) {
                Text(
                    text = chat.messages.last().timeStamp,
                    color = SecondaryText,
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.padding(DefaultPaddingSmall))
                if (chat.unreadCount != 0) {
                    Box(
                        modifier = Modifier
                            .size(22.dp)
                            .background(color = LightBlue, shape = CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = chat.unreadCount.toString(),
                            color = White,
                            style = MaterialTheme.typography.bodySmall,
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ChatRowPreview() {
    MessagingTheme {
        ChatRow(getAllChats().first())
    }
}
