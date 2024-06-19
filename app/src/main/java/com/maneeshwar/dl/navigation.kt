package com.maneeshwar.dl

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Preview
@Composable
fun App() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "loginnn") {
        composable("loginnn") { loginnn(navController) }
        composable("home"){ home(navController)}
        composable("info"){ info(navController)}
        composable("scaffoldc/{name}") { backStackEntry ->
            val name= backStackEntry.arguments?.getString("name") ?: ""
            scaffoldc(name, navController)
        }


    }
}
