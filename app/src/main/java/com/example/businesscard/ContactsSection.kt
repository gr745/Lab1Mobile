package com.example.businesscard

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ContactsSection() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        ContactItem(
            icon = Icons.Default.Phone,
            text = stringResource(R.string.phone_number),
            modifier = Modifier.fillMaxWidth(0.8f)
        )

        ContactItem(
            icon = Icons.Default.Email,
            text = stringResource(R.string.email),
            modifier = Modifier.fillMaxWidth(0.8f)
        )

    }
}

@Composable
fun ContactItem(
    icon: ImageVector,
    text: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = MaterialTheme.colorScheme.primary,
            modifier = Modifier.size(24.dp)
        )

        Spacer(modifier = Modifier.width(16.dp))

        Text(
            text = text,
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.onSurface
        )
    }
}

@Preview
@Composable
fun ContactsSectionPreview() {
    ContactsSection()
}

@Preview
@Composable
fun ContactItemPreview() {
    ContactItem(
        icon = Icons.Default.Phone,
        text = stringResource(R.string.phone_number)
    )
}