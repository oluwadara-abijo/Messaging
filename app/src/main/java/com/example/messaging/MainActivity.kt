package com.example.messaging

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.messaging.ui.components.BottomBar
import com.example.messaging.ui.screens.ChatsScreen
import com.example.messaging.ui.theme.Dimens
import com.example.messaging.ui.theme.MessagingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessagingTheme {
                Box {
                    ChatsScreen()

                    FloatingActionButton(
                        onClick = {},
                        modifier = Modifier
                            .align(Alignment.BottomEnd)
                            .padding(
                                horizontal = Dimens.DefaultPadding,
                                vertical = Dimens.BottomBarHeight + Dimens.DefaultPadding
                            ),
                        shape = RoundedCornerShape(Dimens.DefaultPadding)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_edit),
                            contentDescription = "New chat"
                        )
                    }
                    NavigationBar(
                        modifier = Modifier.align(Alignment.BottomEnd)
                    ) {
                        BottomBar(
                            isTabSelected = { tab -> tab.isSelected },
                            onTabSelected = {},
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun ChatPreview() {
    MessagingTheme {
        ChatsScreen()
    }
}