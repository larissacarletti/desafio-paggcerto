package com.example.beerapp.api

import androidx.lifecycle.LiveData
import com.example.beerapp.models.BeersItem
import retrofit2.http.GET

interface BeerApi {

    @GET("v2/beers")
    fun getAllBeers() : LiveData<List<BeersItem>>

    @GET("v2/beers")
    suspend fun getBeer(beer: LiveData<BeersItem>)


}