package ru.msokolov.cryptomessenger

import android.app.Application
import ru.msokolov.cryptomessenger.dagger.DependenciesMap
import ru.msokolov.cryptomessenger.dagger.HasDependencies
import ru.msokolov.cryptomessenger.di.DaggerAppComponent
import javax.inject.Inject

class MainApplication: Application(), HasDependencies {

    @Inject
    override lateinit var dependenciesMap: DependenciesMap

    override fun onCreate() {
        DaggerAppComponent.builder()
            .application(this)
            .build()
            .inject(this)
        super.onCreate()
    }
}