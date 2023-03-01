package com.example.beerapp.api

import com.example.beerapp.models.BeersItem
import retrofit2.Response
import retrofit2.http.GET

interface BeerApi {

    @GET("v2/beers")
    suspend fun getBeer() : Response<BeersItem>


}