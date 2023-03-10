package com.example.beerapp.repository

import com.example.beerapp.api.BeerApi
import com.example.beerapp.models.BeersItem
import retrofit2.Response
import javax.inject.Inject

class BeerRepository @Inject constructor (private val beerApi: BeerApi) {

    suspend fun getBeerDetails(): List<BeersItem>? {
        return beerApi.getBeer().body()
    }

}