package com.example.beerapp.presentation.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.example.beerapp.models.BeersItem

//@Composable
//fun BeerListItem(beersItem: BeersItem, onClick: () -> Unit) {
//    BeerListItemView(imageUrl = beersItem.imageUrl, title = beersItem.name, onClick = onClick)
//}


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun BeerCard(
    imageUrl: String,
    modifier: Modifier = Modifier,
    title: String,
    onClick: () -> Unit
) {
    Card(
        onClick = onClick,
        elevation = 2.dp,
        backgroundColor = Color.White,
        shape = RoundedCornerShape(10.dp),
        modifier = modifier.padding(10.dp)
    ) {
        Column(Modifier.fillMaxWidth()) {
            val painter = rememberAsyncImagePainter(imageUrl)
            Image(painter = painter, contentDescription = null)

            Spacer(modifier = Modifier.height(10.dp))

            Box(
                modifier = Modifier
                    .height(25.dp)
                    .background(Color(android.graphics.Color.parseColor("#EC9D00")))
            ) {
                Text(
                    text = title,
                    color = Color.Black,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}
