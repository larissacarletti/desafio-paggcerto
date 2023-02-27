package com.example.beerapp.models


import com.google.gson.annotations.SerializedName

data class BeersItem(
    @SerializedName("description")
    val description: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image_url")
    val imageUrl: String,
    @SerializedName("ingredients")
    val ingredients: Ingredients,
    @SerializedName("name")
    val name: String,
    @SerializedName("volume")
    val volume: Volume
)