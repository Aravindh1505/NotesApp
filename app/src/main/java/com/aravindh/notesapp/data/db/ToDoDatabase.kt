package com.aravindh.notesapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.aravindh.notesapp.data.models.ToDoTask


@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase : RoomDatabase() {

    abstract fun todoDao() : ToDoDao
}