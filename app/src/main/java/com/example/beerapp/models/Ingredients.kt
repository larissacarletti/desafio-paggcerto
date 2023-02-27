package com.example.beerapp.models


import com.google.gson.annotations.SerializedName

data class Ingredients(
    @SerializedName("malt")
    val malt: List<Malt>,
    @SerializedName("yeast")
    val yeast: String
)