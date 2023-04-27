package com.example.composekotlin.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composekotlin.R
import com.example.composekotlin.data.ItemRowModel
import com.example.composekotlin.ui.theme.Gray100

@Composable
fun LazyRowItem() {
    LazyRow(modifier = Modifier
        .fillMaxWidth()
        .background(Gray100)
    ){
        itemsIndexed(
            listOf(
                ItemRowModel(R.drawable.images_1, "Имя"),
                ItemRowModel(R.drawable.images_2, "Майя"),
                ItemRowModel(R.drawable.images_3, "Виолетта"),
                ItemRowModel(R.drawable.images_4, "Ирина"),
                ItemRowModel(R.drawable.images_5, "Илона"),
                ItemRowModel(R.drawable.images_6, "Инесса"),


            )
        ) { _, item ->
            ItemRow(itemRowModel = item)
        }
    }
}