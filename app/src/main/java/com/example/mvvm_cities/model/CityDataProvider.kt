package com.example.mvvm_cities.model

import com.example.mvvm_cities.R

class CityDataProvider {

    private val cities = arrayListOf<City>()

    init {
        cities.add(City("Bangkok", R.drawable.bangkok, 10_000_000))
        cities.add(City("London", R.drawable.london, 8_900_000))
        cities.add(City("Rio", R.drawable.rio, 6_700_000))
    }

    fun getCities() = cities
}