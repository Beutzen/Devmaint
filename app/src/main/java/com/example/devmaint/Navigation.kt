package com.example.devmaint

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun MyBottomNavigation(navController: NavController) {
    val destinationList = listOf(Material,Task,Tools)
    val selectedIndex = rememberSaveable() {
        mutableStateOf(0)

    }
    BottomNavigation() {
        destinationList.forEachIndexed { index, destination -> BottomNavigationItem(
            label = { Text(text = destination.title) },
            icon = {
                Icon(painter = painterResource(id = destination.icon),
                    contentDescription = destination.title)
            },
            selected = index == selectedIndex.value,
            onClick = {
                selectedIndex.value = index
                navController.navigate(destinationList[index].route) {
                    popUpTo(Material.route)
                    launchSingleTop = true
                }
            })

        }

    }

}

@Composable
fun BottomNav() {
    val navController = rememberNavController()
    Scaffold(bottomBar = { MyBottomNavigation(navController = navController)}) {
        Box(Modifier.padding(it)) {
            NavHost(navController = navController, startDestination = Material.route) {
                composable(Material.route){

                }
                composable(Task.route){

                }
                composable(Tools.route) {

                }




            }
        }

        
    }

}