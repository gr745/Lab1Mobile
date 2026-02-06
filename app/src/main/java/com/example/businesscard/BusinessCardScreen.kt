package com.example.businesscard

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.businesscard.ui.theme.BusinessCardTheme

@Composable
fun BusinessCardScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Аватар
            AvatarSection()

            Spacer(modifier = Modifier.height(100.dp))

            // Информация
            InfoSection()

            Spacer(modifier = Modifier.height(48.dp))

            // Контакты
            ContactsSection()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardScreenPreview() {
    BusinessCardTheme {
        BusinessCardScreen()
    }
}