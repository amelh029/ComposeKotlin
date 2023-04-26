package com.example.composekotlin.compose

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LazyRowItem() {
    LazyRow(modifier = Modifier.fillMaxSize()
    ){
        itemsIndexed(
            listOf("Item 1", "Item 2", "Item 3", "Item 4")
        ){_, item->
            Text(text = item,
                fontSize = 30.sp,
                modifier = Modifier.padding(horizontal = 10.dp)
            )
        }
    }
}