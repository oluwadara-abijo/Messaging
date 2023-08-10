package com.example.messaging.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.messaging.ui.theme.BackgroundDark
import com.example.messaging.ui.theme.BackgroundLight
import com.example.messaging.ui.theme.Dimens.DefaultPadding

@Composable
fun Screen(
    modifier: Modifier,
    content: @Composable BoxScope.() -> Unit,
) {
    Box(
        modifier = modifier
            .background(color = if (isSystemInDarkTheme()) BackgroundDark else BackgroundLight)
            .fillMaxSize()
            .padding(DefaultPadding)
    ) {
        content()
    }
}
