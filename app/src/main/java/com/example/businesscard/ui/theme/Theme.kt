package com.example.businesscard.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val GreenColorScheme = lightColorScheme(
    primary = PrimaryGreen,
    background = LightGreen
)

@Composable
fun BusinessCardTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = GreenColorScheme,
        content = content
    )
}