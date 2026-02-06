package com.example.businesscard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun InfoSection() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.full_name),
            fontSize = dimensionResource(R.dimen.text_title).value.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.spacing_small)))

        Text(
            text = stringResource(R.string.position),
            fontSize = dimensionResource(R.dimen.text_subtitle).value.sp,
            color = MaterialTheme.colorScheme.secondary
        )

        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.spacing_small)))

        Text(
            text = stringResource(R.string.group),
            fontSize = dimensionResource(R.dimen.text_subtitle).value.sp,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )

        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.spacing_small)))

        Text(
            text = stringResource(R.string.course),
            fontSize = dimensionResource(R.dimen.text_subtitle).value.sp,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
    }
}
