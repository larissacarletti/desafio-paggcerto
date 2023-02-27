package com.example.beerapp.models


import com.google.gson.annotations.SerializedName

data class BeersItem(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("volume") val volume: Volume,
    @SerializedName("image_url") val imageUrl: String,
    @SerializedName("description") val description: String,
    @SerializedName("ingredients") val ingredients: Ingredients,
) {
    data class Malt(
        @SerializedName("name") val name: String
    )

    data class Volume(
        @SerializedName("value") val value: Int,
        @SerializedName("unit") val unit: String,
    )

    data class Ingredients(
        @SerializedName("malt") val malt: List<Malt>,
        @SerializedName("yeast") val yeast: String
    )
}