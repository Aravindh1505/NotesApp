package com.aravindh.notesapp.navigation

import androidx.navigation.NavHostController
import com.aravindh.notesapp.util.Actions
import com.aravindh.notesapp.util.Constants.LIST_SCREEN

class Screens(navHostController: NavHostController) {
    val list: (Actions) -> Unit = { actions ->
        navHostController.navigate(route = "list/{${actions.name}}") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }

    val task: (Int) -> Unit = { taskId ->
        navHostController.navigate(route = "task/$taskId")
    }


}