package com.example.composekotlin.botton_navigation

import com.example.composekotlin.R

sealed class BottomItem(
    val title: String,
    val iconId: Int,
    val route: String
) {
    object Screen1: BottomItem("Screen 1", R.drawable.ic_hive, "screen_1" )
    object Screen2: BottomItem("Screen 2", R.drawable.ic_icecream, "screen_2")
    object Screen3: BottomItem("Screen 2", R.drawable.ic_kayaking, "screen_3")
    object Screen4: BottomItem("Screen 2", R.drawable.ic_light, "screen_4")


}