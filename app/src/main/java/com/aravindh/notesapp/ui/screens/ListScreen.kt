package com.aravindh.notesapp.ui.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListScreen(
    navigateToTaskScreen: (Int) -> Unit
) {
    Scaffold(
        content = { paddingValues ->
            paddingValues.calculateBottomPadding()
        },
        floatingActionButton = { FabButton(navigateToTaskScreen = navigateToTaskScreen) }
    )
}

@Composable
fun FabButton(
    navigateToTaskScreen: (Int) -> Unit
) {
    FloatingActionButton(onClick = { /*navigateToTaskScreen(-1)*/ }) {
        Icon(imageVector = Icons.Filled.Add, contentDescription = "Add button")
    }
}

@Composable
@Preview
fun ListScreenPreview() {
    ListScreen(navigateToTaskScreen = {})
}