package com.example.beerapp.repository

import androidx.lifecycle.LiveData
import com.example.beerapp.api.BeerApi
import com.example.beerapp.models.BeersItem
import javax.inject.Inject

class BeerRepository @Inject constructor (private val beerApi: BeerApi) {

    val allBeers: LiveData<List<BeersItem>> = beerApi.getAllBeers()

    suspend fun getBeerDetails(beer: LiveData<BeersItem>) {
        return beerApi.getBeer(beer)
    }

}