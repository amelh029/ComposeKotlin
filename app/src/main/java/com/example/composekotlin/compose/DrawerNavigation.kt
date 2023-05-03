package com.example.composekotlin.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DrawerNavigationHeader() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(170.dp)
            .background(Color.Cyan),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center


    ) {
        Text(
            text = "Header",
            fontSize = 20.sp,
            color = Color.White
        )

    }
}

@Composable
fun DrawerBody() {
    LazyColumn(modifier = Modifier.fillMaxWidth()) {
        items(5) {
            Text(
                modifier = Modifier.fillMaxWidth()
                    .clickable {  }
                    .padding(10.dp),
                text = "Menu item $it"
            )
        }
    }
}