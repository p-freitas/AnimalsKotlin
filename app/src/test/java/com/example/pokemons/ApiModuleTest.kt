package com.example.pokemons

import com.example.pokemons.di.ApiModule
import com.example.pokemons.model.AnimalApiService

class ApiModuleTest(val mockService: AnimalApiService): ApiModule() {
    override fun provideAnimalApiService(): AnimalApiService {
        return mockService
    }
}