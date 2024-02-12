package com.br.kmpdemo.compose.previews

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.br.kmpdemo.compose.previews.utils.MockData
import com.br.kmpdemo.compose.resources.theme.KMPDemoTheme
import com.br.kmpdemo.compose.ui.forecasts.WeeklyChipList

@Composable
@Preview
fun WeeklyChipListPreview() {
    KMPDemoTheme {
        WeeklyChipList(MockData.getMockWeeklyForecast())
    }
}
