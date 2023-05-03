package com.example.composekotlin.compose

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ScafoldScreen(context: Context) {
    val corotineScope = rememberCoroutineScope()
    val scaffoldState = rememberScaffoldState()

    Scaffold(
        scaffoldState = scaffoldState,
        snackbarHost = {host->
                       SnackbarHost(hostState = host){data->
                           Snackbar(
                               backgroundColor = Color.White,
                               snackbarData = data,
                               shape = RoundedCornerShape(20.dp),
                               contentColor = Color.Blue,
                               modifier = Modifier.padding(bottom = 10.dp)
                           )

                       }
        },
        topBar = {

            TopAppBar(title = {
                Text(text = "Meny")

            },
                backgroundColor = Color.White,
                navigationIcon = {
                    IconButton(onClick = {
                        corotineScope.launch {
                            scaffoldState.drawerState.open()
                        }

                    }) {
                        Icon(
                            imageVector = Icons.Filled.Menu,
                            contentDescription = "Menu"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = {
                        corotineScope.launch {
                            val result = scaffoldState.snackbarHostState.showSnackbar(
                                message = "Item deleted",
                                actionLabel = "Undone"
                            )
                            if (result == SnackbarResult.ActionPerformed) {
                                Toast.makeText(context, "Item recovered", Toast.LENGTH_SHORT)
                                    .show()
                            }
                        }
                    }) {
                        Icon(
                            imageVector = Icons.Filled.Delete,
                            contentDescription = "Delete"
                        )
                    }
                    IconButton(onClick = {
                        Toast.makeText(context, "Searh", Toast.LENGTH_SHORT).show()
                    }) {
                        Icon(
                            imageVector = Icons.Filled.Search,
                            contentDescription = "Searh"
                        )
                    }
                }
            )
        },
        drawerContent = {
            DrawerNavigationHeader()
            DrawerBody()

        }
    ) {
    }
}

