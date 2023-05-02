package com.example.composekotlin.compose

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.example.composekotlin.botton_navigation.BottomItem

@Composable
fun Screen1() {
    Text(
        modifier = Modifier.fillMaxSize().
        wrapContentHeight(),
        text = "Screen1",
        textAlign = TextAlign.Center
    )
}
@Composable
fun Screen2() {
    Text(
        modifier = Modifier.fillMaxSize().
        wrapContentHeight(),
        text = "Screen2",
        textAlign = TextAlign.Center
    )
}@Composable
fun Screen3() {
    Text(
        modifier = Modifier.fillMaxSize().
        wrapContentHeight(),
        text = "Screen3",
        textAlign = TextAlign.Center
    )
}
@Composable
fun Screen4() {
    Text(
        modifier = Modifier.fillMaxSize().
        wrapContentHeight(),
        text = "Screen4",
        textAlign = TextAlign.Center
    )
}

