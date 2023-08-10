package com.example.messaging.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.messaging.R
import com.example.messaging.ui.model.BottomBarItem
import com.example.messaging.ui.theme.PrimaryText


@Composable
fun RowScope.BottomBar(
    isTabSelected: (BottomBarItem) -> Boolean,
    onTabSelected: (BottomBarItem) -> Unit,
) {
    BOTTOM_TABS.forEach { item ->
        NavigationBarItem(
            selected = isTabSelected(item),
            onClick = { onTabSelected(item) },
            icon = {
                BottomBarItemIcon(icon = item.icon, isSelected = isTabSelected(item))
            },
            label = {
                Text(
                    text = item.title,
                    color = PrimaryText,
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        )
    }
}

@Composable
fun BottomBarItemIcon(@DrawableRes icon: Int, isSelected: Boolean) {
    Icon(painter = painterResource(id = icon), contentDescription = null)
//    Image(
//        modifier = Modifier
//            .clickable { }
//            .background(color = if (isSelected) PaleBlue else Transparent),
//        painter = painterResource(id = icon),
//        contentDescription = "Item"
//    )
}


val BOTTOM_TABS = listOf(
    BottomBarItem("Chats", R.drawable.ic_chats),
    BottomBarItem("Contacts", R.drawable.ic_contacts),
    BottomBarItem("Settings", R.drawable.ic_settings)

)

@Preview
@Composable
fun NavBarPreview() {
    Row {
        BottomBar(isTabSelected = { false }, onTabSelected = {})
    }
}