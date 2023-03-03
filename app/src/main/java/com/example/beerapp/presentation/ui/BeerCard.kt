package com.example.beerapp.presentation.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter


@Composable
fun BeerCard(
    imageUrl: String,
    backgroundColor : Color,
    modifier: Modifier = Modifier,
    title: String
){
    Card (
        backgroundColor = backgroundColor,
        shape = RoundedCornerShape(10.dp),
        modifier = modifier.padding(10.dp)
    ){
        val painter = rememberAsyncImagePainter(imageUrl)

        Image(painter = painter, contentDescription = null)

        Spacer(modifier = Modifier.height(10.dp))
        
        Box(
            modifier = Modifier.height(25.dp)
                .background(Color(android.graphics.Color.parseColor("#EC9D00")))
        ){
            Text(
                text = title,
                color = Color.Black,
                fontSize = 20.sp,
                textAlign = TextAlign.Center
            )
        }



    }
}
//@Composable
//@Preview
//fun BeerCardPreview() {
//
//    BeerCard(imageUrl = "" , backgroundColor = Color.White)
//
//
//    }

