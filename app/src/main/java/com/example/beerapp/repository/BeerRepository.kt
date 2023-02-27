package com.example.beerapp.repository

import com.example.beerapp.api.BeerApi
import com.example.beerapp.models.BeersItem
import retrofit2.Response
import javax.inject.Inject

class BeerRepository @Inject constructor (private val beerApi: BeerApi) {

    val allBeers: Response<List<BeersItem>> = beerApi.getAllBeers()

    suspend fun getBeerDetails(): BeersItem {
        return beerApi.getBeer()
    }

}