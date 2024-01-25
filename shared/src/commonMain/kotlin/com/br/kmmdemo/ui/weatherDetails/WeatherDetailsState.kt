package com.br.kmmdemo.ui.weatherDetails

import com.br.kmmdemo.ui.weatherDetails.airQuality.AirQualityEnum
import com.br.kmmdemo.ui.weatherDetails.feelsLike.FeelsLikeState
import com.br.kmmdemo.ui.weatherDetails.humidity.HumidityState
import com.br.kmmdemo.ui.weatherDetails.pressure.BarometricPressureState
import com.br.kmmdemo.ui.weatherDetails.rainFall.RainFallState
import com.br.kmmdemo.ui.weatherDetails.sunrise_sunset.SunriseSunsetState
import com.br.kmmdemo.ui.weatherDetails.uvIndex.UVIndexEnum
import com.br.kmmdemo.ui.weatherDetails.visibility.VisibilityState
import com.br.kmmdemo.ui.weatherDetails.wind.WindState

data class WeatherDetailsState(
    val airQuality: AirQualityEnum,
    val feelsLikeState: FeelsLikeState,
    val humidityState: HumidityState,
    val pressureState: BarometricPressureState,
    val rainFallState: RainFallState,
    val sunriseSunsetState: SunriseSunsetState,
    val uvIndexState: UVIndexEnum,
    val visibilityState: VisibilityState,
    val windState: WindState
)