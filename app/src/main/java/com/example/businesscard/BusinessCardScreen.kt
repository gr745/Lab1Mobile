package com.example.businesscard

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.dimensionResource
import android.content.res.Configuration

@Composable
fun BusinessCardScreen() {
    val configuration = LocalConfiguration.current
    val screenWidthDp = configuration.screenWidthDp
    val isLandscape = configuration.orientation == Configuration.ORIENTATION_LANDSCAPE
    val isTablet = screenWidthDp >= 600
    val scaleFactor = if (isTablet) 1.3f else 1f

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        if (isLandscape || isTablet) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(dimensionResource(R.dimen.padding_screen) * scaleFactor),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                AvatarSection(
                    avatarSize = dimensionResource(R.dimen.avatar_size) * scaleFactor
                )
                Column(
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.spacedBy(
                        dimensionResource(R.dimen.spacing_section) * scaleFactor
                    )
                ) {
                    InfoSection()
                    ContactsSection()
                }
            }
        } else {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(dimensionResource(R.dimen.padding_screen)),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                AvatarSection()
                Spacer(modifier = Modifier.height(dimensionResource(R.dimen.spacing_section)))
                InfoSection()
                Spacer(modifier = Modifier.height(dimensionResource(R.dimen.spacing_section)))
                ContactsSection()
            }
        }
    }
}
