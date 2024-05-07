package com.br.kmpdemo.di

import ForecastForCityInteractor
import KmpLocationProvider
import com.bottlerocketstudios.launchpad.google.utils.network.service.airquality.AirQualityApiService
import com.br.kmpdemo.network.ktorClient
import com.br.kmpdemo.network.service.TomorrowIoService
import com.br.kmpdemo.network.service.TomorrowIoService.Companion.GOOGLE_MAPS_API_KEY
import com.br.kmpdemo.repositories.WeatherRepository
import com.br.kmpdemo.repository.WeatherRepoImplementation
import com.br.kmpdemo.usecases.forecastusecase.ForecastForCityUseCase
import com.br.kmpdemo.viewmodels.HomeViewModel
import com.br.kmpdemo.viewmodels.MainActivityViewModel
import io.ktor.client.HttpClient
import org.koin.dsl.module

// TODO - Look into moving some of this into data module ??
val domainModule = module {
    // Repositories
    single<WeatherRepository> { WeatherRepoImplementation() }

    // Services
    single<TomorrowIoService> { TomorrowIoService() }

    // Clients
    single<HttpClient> { ktorClient() }
    single { KmpLocationProvider() }
}

val useCaseModule = module {
    single<ForecastForCityUseCase> { ForecastForCityInteractor() }
}

val viewModelModule = module {
//    single { ForecastViewModel() }
    single { HomeViewModel() }
    single { MainActivityViewModel() }
}

val repositoryModule = module {
    single<WeatherRepository> { WeatherRepoImplementation() }
    single<AirQualityApiService> { AirQualityApiService(GOOGLE_MAPS_API_KEY) }
}