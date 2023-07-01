package com.aravindh.notesapp.data.db

import androidx.room.Database
import com.aravindh.notesapp.data.models.ToDoTask


@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase {

    abstract fun todoDao() : ToDoDao
}