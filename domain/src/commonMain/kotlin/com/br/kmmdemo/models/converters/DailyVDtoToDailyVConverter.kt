package com.br.kmmdemo.models.converters

import com.br.kmmdemo.models.DailyValues
import com.br.kmmdemo.network.dtos.DailyDataPointValuesDto

fun DailyDataPointValuesDto?.toDailyValuesModel(): DailyValues {
    return DailyValues(
        cloudBaseAvg = this?.cloudBaseAvg,
        cloudBaseMax = this?.cloudBaseMax,
        cloudBaseMin = this?.cloudBaseMin,
        cloudCeilingAvg = this?.cloudCeilingAvg,
        cloudCeilingMax = this?.cloudCeilingMax,
        cloudCeilingMin = this?.cloudCeilingMin,
        cloudCoverAvg = this?.cloudCoverAvg,
        cloudCoverMax = this?.cloudCoverMax,
        cloudCoverMin = this?.cloudCoverMin,
        dewPointAvg = this?.dewPointAvg,
        dewPointMax = this?.dewPointMax,
        dewPointMin = this?.dewPointMin,
        evapotranspirationAvg = this?.evapotranspirationAvg,
        evapotranspirationMax = this?.evapotranspirationMax,
        evapotranspirationMin = this?.evapotranspirationMin,
        freezingRainIntensityAvg = this?.freezingRainIntensityAvg,
        freezingRainIntensityMax = this?.freezingRainIntensityMax,
        freezingRainIntensityMin = this?.freezingRainIntensityMin,
        humidityAvg = this?.humidityAvg,
        humidityMax = this?.humidityMax,
        humidityMin = this?.humidityMin,
        iceAccumulationAvg = this?.iceAccumulationAvg,
        iceAccumulationLweAvg = this?.iceAccumulationLweAvg,
        iceAccumulationLweMax = this?.iceAccumulationLweMax,
        iceAccumulationLweMin = this?.iceAccumulationLweMin,
        iceAccumulationLweSum = this?.iceAccumulationLweSum,
        iceAccumulationMax = this?.iceAccumulationMax,
        iceAccumulationMin = this?.iceAccumulationMin,
        iceAccumulationSum = this?.iceAccumulationSum,
        moonriseTime = this?.moonriseTime,
        moonsetTime = this?.moonsetTime,
        precipitationProbabilityAvg = this?.precipitationProbabilityAvg,
        precipitationProbabilityMax = this?.precipitationProbabilityMax,
        precipitationProbabilityMin = this?.precipitationProbabilityMin,
        pressureSurfaceLevelAvg = this?.pressureSurfaceLevelAvg,
        pressureSurfaceLevelMax = this?.pressureSurfaceLevelMax,
        pressureSurfaceLevelMin = this?.pressureSurfaceLevelMin,
        rainAccumulationAvg = this?.rainAccumulationAvg,
        rainAccumulationLweAvg = this?.rainAccumulationLweAvg,
        rainAccumulationLweMax = this?.rainAccumulationLweMax,
        rainAccumulationLweMin = this?.rainAccumulationLweMin,
        rainAccumulationMax = this?.rainAccumulationMax,
        rainAccumulationMin = this?.rainAccumulationMin,
        rainAccumulationSum = this?.rainAccumulationSum,
        rainIntensityAvg = this?.rainIntensityAvg,
        rainIntensityMax = this?.rainIntensityMax,
        rainIntensityMin = this?.rainIntensityMin,
        sleetAccumulationAvg = this?.sleetAccumulationAvg,
        sleetAccumulationLweAvg = this?.sleetAccumulationLweAvg,
        sleetAccumulationLweMax = this?.sleetAccumulationLweMax,
        sleetAccumulationLweMin = this?.sleetAccumulationLweMin,
        sleetAccumulationLweSum = this?.sleetAccumulationLweSum,
        sleetAccumulationMax = this?.sleetAccumulationMax,
        sleetAccumulationMin = this?.sleetAccumulationMin,
        sleetIntensityAvg = this?.sleetIntensityAvg,
        sleetIntensityMax = this?.sleetIntensityMax,
        sleetIntensityMin = this?.sleetIntensityMin,
        snowAccumulationAvg = this?.snowAccumulationAvg,
        snowAccumulationLweAvg = this?.snowAccumulationLweAvg,
        snowAccumulationLweMax = this?.snowAccumulationLweMax,
        snowAccumulationLweMin = this?.snowAccumulationLweMin,
        snowAccumulationLweSum = this?.snowAccumulationLweSum,
        snowAccumulationMax = this?.snowAccumulationMax,
        snowAccumulationMin = this?.snowAccumulationMin,
        snowAccumulationSum = this?.snowAccumulationSum,
        snowDepthAvg = this?.snowDepthAvg,
        snowDepthMax = this?.snowDepthMax,
        snowDepthMin = this?.snowDepthMin,
        snowDepthSum = this?.snowDepthSum,
        snowIntensityAvg = this?.snowIntensityAvg,
        snowIntensityMax = this?.snowIntensityMax,
        snowIntensityMin = this?.snowIntensityMin,
        sunriseTime = this?.sunriseTime,
        sunsetTime = this?.sunsetTime,
        temperatureApparentAvg = this?.temperatureApparentAvg,
        temperatureApparentMax = this?.temperatureApparentMax,
        temperatureApparentMin = this?.temperatureApparentMin,
        temperatureAvg = this?.temperatureAvg,
        temperatureMax = this?.temperatureMax,
        uvHealthConcernAvg = this?.uvHealthConcernAvg,
        uvHealthConcernMax = this?.uvHealthConcernMax,
        uvHealthConcernMin = this?.uvHealthConcernMin,
        uvIndexAvg = this?.uvIndexAvg,
        uvIndexMax = this?.uvIndexMax,
        uvIndexMin = this?.uvIndexMin,
        visibilityAvg = this?.visibilityAvg,
        visibilityMax = this?.visibilityMax,
        visibilityMin = this?.visibilityMin,
        weatherCodeMax = this?.weatherCodeMax,
        weatherCodeMin = this?.weatherCodeMin,
        windDirectionAvg = this?.windDirectionAvg,
        windGustAvg = this?.windGustAvg,
        windGustMax = this?.windGustMax,
        windGustMin = this?.windGustMin,
        windSpeedAvg = this?.windSpeedAvg,
        windSpeedMax = this?.windSpeedMax,
        windSpeedMin = this?.windSpeedMin,
    )
}