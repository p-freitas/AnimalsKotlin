package com.example.pokemons

import android.app.Application
import com.example.pokemons.di.PrefsModule
import com.example.pokemons.util.SharedPreferencesHelper

class PrefsModuleTest(val mockPrefs: SharedPreferencesHelper): PrefsModule() {
    override fun provideSharedPreferences(app: Application): SharedPreferencesHelper {
        return mockPrefs
    }
}