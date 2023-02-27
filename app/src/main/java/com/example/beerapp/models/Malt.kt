package com.example.beerapp.models


import com.google.gson.annotations.SerializedName

data class Malt(
    @SerializedName("name")
    val name: String
)