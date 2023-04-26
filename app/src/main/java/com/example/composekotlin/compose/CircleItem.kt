package com.example.composekotlin.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CircleItem(){
    var counter = remember{
        mutableStateOf(0)
    }
    var color = remember {
        mutableStateOf(Color.Blue)
    }

    Box(modifier = Modifier
        .size(100.dp)
        .background(color = color.value, shape = CircleShape).clickable {
            when(++counter.value){
                10 -> color.value = Color.Red
                20 -> color.value = Color.Gray
            }

        },
        contentAlignment = Alignment.Center,

    ){
        Text(text = counter.value.toString(), style = TextStyle(color = Color.White), fontSize = 20.sp)
    }



}