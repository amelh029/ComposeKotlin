package com.example.composekotlin.compose

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.composekotlin.botton_navigation.BottomNavigation


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    val navController =  rememberNavController()
    Scaffold(
        bottomBar ={

        BottomNavigation(navController = navController)
        }
    ) {
        Navgraph(navHostController = navController)
        
    }
}