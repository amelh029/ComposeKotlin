package com.example.composekotlin.compose

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composekotlin.R


@Composable
fun ListItem(name: String, prof:String){
    var counter = remember{
        mutableStateOf(0)
    }
    var color = remember {
        mutableStateOf(Color.White)
    }
    Card(modifier = Modifier
        .padding(10.dp)
        .fillMaxWidth()
        .background(color.value)
        /*.clickable {
            counter.value++
        }*/
        ,
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ){
        Box(){
            Row(verticalAlignment = Alignment.CenterVertically){
                Image(painter = painterResource(id = R.drawable.ic_avatar),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(5.dp)
                        .size(64.dp)
                        .clip(CircleShape),
                )
                Column(modifier = Modifier.padding(start = 16.dp)) {
                    Text(text = counter.value.toString())
                    Text(text = prof)

                }
                Button( onClick = {
                    counter.value++
                    if(counter.value>10){
                        color=(
                        mutableStateOf(Color.Gray))
                    }

                },
                modifier = Modifier
                    .background(color = color.value, shape = CircleShape)
                    .size(20.dp, 20.dp)
                    ) {
                    Text(text = counter.toString())
                }

            }

        }
    }
}