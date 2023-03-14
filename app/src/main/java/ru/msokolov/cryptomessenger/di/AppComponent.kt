package ru.msokolov.cryptomessenger.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import ru.msokolov.cryptomessenger.MainApplication
import ru.msokolov.cryptomessenger.di.features.FeatureDepsModule
import ru.msokolov.cryptomessenger.di.features.MainActivityDeps
@Component(modules = [AppModule::class, FeatureDepsModule::class])
interface AppComponent : MainActivityDeps {

    fun inject(mainApplication: MainApplication)

    @Component.Builder
    interface Builder{

        fun build(): AppComponent

        @BindsInstance
        fun application(application: Application) : Builder
    }
}

@Module
class AppModule