package com.aravindh.notesapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.aravindh.notesapp.navigation.destinations.listComposable
import com.aravindh.notesapp.navigation.destinations.taskComposable
import com.aravindh.notesapp.util.Constants.LIST_SCREEN

@Composable
fun SetupNavigation(navHostController: NavHostController) {

    val screen = remember(navHostController) {
        Screens(navHostController = navHostController)
    }

    NavHost(navController = navHostController, startDestination = LIST_SCREEN) {
        listComposable(navigateToTaskScreen = screen.task)

        taskComposable(navigateToListScreen = screen.list)

    }


}