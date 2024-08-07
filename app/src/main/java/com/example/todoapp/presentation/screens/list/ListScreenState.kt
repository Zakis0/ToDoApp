package com.example.todoapp.presentation.screens.list

import com.example.todoapp.domain.models.Items
import com.example.todoapp.presentation.data.models.ThemeMode

/**
 * Task list screen state
 **/
data class ListScreenState(
    val todoItems: Items = Items(),
    val doneTaskCounter: Int = 0,
    val hideDoneTask: Boolean = false,
    val isDataLoadedSuccessfully: Boolean = false,
    val isSuccessfulAction: Boolean = false,
    val snackBarOnErrorAction: ListScreenAction = ListScreenAction.Nothing,
    val hasInternet: Boolean = false,
    val themeMode: ThemeMode = ThemeMode.SYSTEM,
)
