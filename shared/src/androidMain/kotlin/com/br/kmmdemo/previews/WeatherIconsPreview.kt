package com.br.kmmdemo.previews

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import com.br.kmmdemo.forecasts.WeatherEnum
import com.br.kmmdemo.resources.SharedRes
import com.br.kmmdemo.theme.Dimens
import dev.icerock.moko.resources.compose.painterResource
import dev.icerock.moko.resources.compose.stringResource

@Composable
@Preview
fun `Day Weather Icons Preview`() {
    val icons = listOf(
        WeatherEnum.SUNNY,
        WeatherEnum.DAY_PARTLY_CLOUDY,
        WeatherEnum.DAY_FOG,
        WeatherEnum.DAY_RAIN,
        WeatherEnum.DAY_SNOW,
        WeatherEnum.DAY_THUNDERSTORM,
    )
    Row(
        horizontalArrangement = Arrangement.spacedBy(Dimens.grid_1, Alignment.CenterHorizontally)
    ) {
        icons.forEach { weather ->
            Image(
                modifier = Modifier.size(Dimens.grid_4_5),
                painter = painterResource(weather.icon),
                contentDescription = stringResource(SharedRes.strings.weatherIcon),
                contentScale = ContentScale.Crop
            )
        }
    }
}

@Composable
@Preview
fun `Night Weather Icons Preview`() {
    val icons = listOf(
        WeatherEnum.NIGHT_CLEAR,
        WeatherEnum.NIGHT_CLOUDY,
        WeatherEnum.NIGHT_FOG,
        WeatherEnum.NIGHT_RAIN,
        WeatherEnum.NIGHT_SNOW,
        WeatherEnum.NIGHT_THUNDERSTORM,
    )
    Row(
        horizontalArrangement = Arrangement.spacedBy(Dimens.grid_1, Alignment.CenterHorizontally)
    ) {
        icons.forEach { weather ->
            Image(
                modifier = Modifier.size(Dimens.grid_4_5),
                painter = painterResource(weather.icon),
                contentDescription = stringResource(SharedRes.strings.weatherIcon),
                contentScale = ContentScale.Crop
            )
        }
    }
}

@Composable
@Preview
fun `Other Weather Icons Preview`() {
    val icons = listOf(
        WeatherEnum.WINDY,
        WeatherEnum.OVERCAST_CLOUDY,
        WeatherEnum.LIGHT_RAIN,
        WeatherEnum.HEAVY_RAIN,
        WeatherEnum.HAIL,
        WeatherEnum.LIGHTENING,
    )
    Row(
        horizontalArrangement = Arrangement.spacedBy(Dimens.grid_1, Alignment.CenterHorizontally)
    ) {
        icons.forEach { weather ->
            Image(
                modifier = Modifier.size(Dimens.grid_4_5),
                painter = painterResource(weather.icon),
                contentDescription = stringResource(SharedRes.strings.weatherIcon),
                contentScale = ContentScale.Crop
            )
        }
    }
}