package com.maneeshwar.dl

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun loginnn(navHostController: NavHostController){
    var name by remember {
        mutableStateOf("")
    }
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        OutlinedTextField(value = name, onValueChange ={
            name=it
        }, label = {
            Text(text = "Name")
        })
        Button(onClick = {navHostController.navigate("scaffoldc/$name")}) {
            Text(text = "Continue")

        }


    }
}