package com.br.kmpdemo.dtos

import com.br.kmpdemo.network.dtos.Dto
import com.br.kmpdemo.network.dtos.HourlyDto
import kotlinx.serialization.Serializable

@Serializable
data class TimelinesDto(
    val hourly: List<HourlyDto?>? = null,
    val minutely: List<MinutelyDto?>? = null,
    val daily: List<DailyDto?>? = null
): Dto