package com.example.weatherapi.di

import com.example.weatherapi.presentation.city.CityFragment
import com.example.weatherapi.presentation.search.SearchFragment
import com.squareup.anvil.annotations.MergeComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@MergeComponent(AppScope::class)
interface AppComponent {
  @Component.Factory
  interface Factory {
    fun create(): AppComponent
  }

  fun inject(cityFragment: CityFragment)
  fun inject(searchFragment: SearchFragment)
}