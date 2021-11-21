package com.example.weatherapi.di

import com.example.weatherapi.presentation.city.CityFragment
import com.example.weatherapi.presentation.search.SearchFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [BasicModule::class])
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun baseUrl(@Named("baseUrl") baseUrl: String): Builder
        fun build(): AppComponent
    }

    fun inject(cityFragment: CityFragment)
    fun inject(searchFragment: SearchFragment)
}