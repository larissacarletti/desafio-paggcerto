package com.example.beerapp.di

import com.example.beerapp.api.BeerApi
import com.example.beerapp.repository.BeerRepository
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    fun provideBeerApi() : BeerApi {
        return Retrofit.Builder()
            .baseUrl("https://api.punkapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create()
    }
    fun provideRepository(beerApi: BeerApi) : BeerRepository {
        return BeerRepository(beerApi)
    }

}