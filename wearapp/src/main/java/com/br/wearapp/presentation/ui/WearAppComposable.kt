package com.br.wearapp.presentation.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.tooling.preview.devices.WearDevices
import com.br.wearapp.presentation.theme.KMP_DemoTheme
import com.br.wearapp.presentation.util.getScreenList
import com.google.android.horologist.annotations.ExperimentalHorologistApi
import com.google.android.horologist.compose.layout.AppScaffold
import com.google.android.horologist.compose.layout.ScreenScaffold
import com.google.android.horologist.compose.layout.rememberResponsiveColumnState

@OptIn(ExperimentalHorologistApi::class)
@Composable
fun WearApp(contentItems: List<Unit>) {
    KMP_DemoTheme {
        AppScaffold() {
            val listState = rememberResponsiveColumnState()
            val contentModifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
            ScreenScaffold(
                modifier = contentModifier,
                scrollState = listState,
            ) {
                WearRootColumn(
                    contentItems = contentItems,
                    listState = listState,
                )
            }
        }
    }
}

@Preview(device = WearDevices.SMALL_ROUND, showSystemUi = true)
@Composable
fun WearAppSmallPreview() {
    WearApp(contentItems = getScreenList())
}

@Preview(device = WearDevices.LARGE_ROUND, showSystemUi = true)
@Composable
fun WearAppLargePreview() {
    WearApp(contentItems = getScreenList())
}

@Preview(device = WearDevices.SQUARE, showSystemUi = true)
@Composable
fun WearAppSquarePreview() {
    WearApp(contentItems = getScreenList())
}

@Preview(device = WearDevices.RECT, showSystemUi = true)
@Composable
fun WearAppRectanglePreview() {
    WearApp(contentItems = getScreenList())
}