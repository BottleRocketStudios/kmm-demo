package android

import MeasurementPreference
import android.app.Application
import android.di.androidModule
import com.br.kmpdemo.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class KmpDemoApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@KmpDemoApplication)
            androidLogger()
            modules(appModule() + androidModule)
        }
        MeasurementPreference.init(this)
    }
}