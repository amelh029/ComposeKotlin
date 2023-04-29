package com.example.composekotlin.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.example.composekotlin.R
import com.example.composekotlin.data.ItemColumnModel
import com.example.composekotlin.ui.theme.Gray100

@Composable
fun LazuColumn() {

    LazyColumn(
        modifier = Modifier
            .fillMaxHeight()
            .background(Gray100)
    ) {
        itemsIndexed(
            listOf(
                ItemColumnModel(R.drawable.images_1, "Имя", "vfew isgj iej gijej 0rje 09g 09er9 ew09k"),
                ItemColumnModel(R.drawable.images_2, "Майя", "vfew isgj iej gijej 0rje 09g 09er9 ew09k"),
                ItemColumnModel(R.drawable.images_3, "Виолетта", "vfew isgj iej gijej 0rje 09g 09er9 ew09k"),
                ItemColumnModel(R.drawable.images_4, "Ирина", "vfew isgj iej gijej 0rje 09g 09er9 ew09k"),
                ItemColumnModel(R.drawable.images_5, "Илона", "vfew isgj iej gijej 0rje 09g 09er9 ew09k"),
                ItemColumnModel(R.drawable.images_6, "Инесса", "vfew isgj iej gijej 0rje 09g 09er9 ew09k"),


                )
        ) { _, item ->
            ItemColumn(itemColumnModel = item)
        }
    }

}