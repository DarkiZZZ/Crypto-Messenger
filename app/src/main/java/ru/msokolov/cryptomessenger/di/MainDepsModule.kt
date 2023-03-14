package ru.msokolov.cryptomessenger.di

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ru.msokolov.cryptomessenger.bottom_navigation.BottomNavigation
import ru.msokolov.cryptomessenger.bottom_navigation.BottomNavigationImpl
import ru.msokolov.cryptomessenger.dagger.Dependencies
import ru.msokolov.cryptomessenger.dagger.DependenciesKey
import ru.msokolov.cryptomessenger.di.features.MainActivityDeps

@Module
interface MainDepsModule {

    @Binds
    @IntoMap
    @DependenciesKey(MainActivityDeps::class)
    fun bindMainScreenDeps(appComponent: AppComponent): Dependencies

    @Binds
    fun bindBottomNavigation(bottomNavigation: BottomNavigationImpl) : BottomNavigation
}