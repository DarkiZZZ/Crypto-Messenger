package ru.msokolov.cryptomessenger.dagger

import dagger.MapKey
import ru.msokolov.cryptomessenger.dagger.Dependencies
import kotlin.reflect.KClass

@MapKey
annotation class DependenciesKey(val value: KClass<out Dependencies>)
