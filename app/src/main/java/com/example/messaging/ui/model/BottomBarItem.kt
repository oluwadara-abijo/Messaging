package com.example.messaging.ui.model

import androidx.annotation.DrawableRes

data class BottomBarItem(val title: String, @DrawableRes val icon: Int, val isSelected: Boolean = false)
