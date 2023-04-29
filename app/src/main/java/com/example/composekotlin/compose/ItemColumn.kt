package com.example.composekotlin.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.composekotlin.data.ItemColumnModel
import com.example.composekotlin.data.ItemRowModel

@Composable
fun ItemColumn(itemColumnModel: ItemColumnModel) {
    var isExpanded by remember {
        mutableStateOf(false)
    }
    Row(modifier = Modifier
        .padding(3.dp)
        .fillMaxWidth()
        .background(Color.White)

    ) {
        Image(painter = painterResource(id = itemColumnModel.imageId),
            contentDescription ="Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(3.dp)
                .size(64.dp)
                .clip(CircleShape)
        )
        Column(modifier = Modifier
            .padding(start =10.dp ,top = 10.dp)) {
            Text(text = itemColumnModel.title)
            Text(modifier = Modifier.clickable {
                isExpanded = !isExpanded
            }, maxLines = if(isExpanded)10 else 1
                , text = itemColumnModel.content)
        }
    }
}
