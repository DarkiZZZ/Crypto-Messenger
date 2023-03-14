package ru.msokolov.cryptomessenger.di.features

import dagger.Component
import ru.msokolov.cryptomessenger.MainActivity
import ru.msokolov.cryptomessenger.bottom_navigation.BottomNavigation
import ru.msokolov.cryptomessenger.dagger.Dependencies

@Component(dependencies = [MainActivityDeps::class])
interface MainActivityComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        fun build(): MainActivityComponent

        fun deps(mainActivityDeps: MainActivityDeps) : Builder
    }
}

interface MainActivityDeps : Dependencies {
    val bottomNavigation : BottomNavigation
}