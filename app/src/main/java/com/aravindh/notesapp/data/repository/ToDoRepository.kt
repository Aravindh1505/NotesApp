package com.aravindh.notesapp.data.repository

import com.aravindh.notesapp.data.db.ToDoDao
import com.aravindh.notesapp.data.models.ToDoTask
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ViewModelScoped
class ToDoRepository @Inject constructor(private val toDoDao: ToDoDao) {

    val getAllTasks: Flow<List<ToDoTask>> = toDoDao.getAllTasks()

    val sortByLowPriority: Flow<List<ToDoTask>> = toDoDao.sortByLowPriority()

    val sortByHighPriority: Flow<List<ToDoTask>> = toDoDao.sortByHighPriority()

    fun search(searchQuery: String): Flow<List<ToDoTask>> = toDoDao.searchTask(searchQuery)

    fun getSingleTask(id: Int): Flow<ToDoTask> = toDoDao.getSingleTask(id)

    suspend fun insertTask(toDoTask: ToDoTask) = toDoDao.insertTask(toDoTask)

    suspend fun updateTask(toDoTask: ToDoTask) = toDoDao.updateTask(toDoTask)

    suspend fun deleteTask(toDoTask: ToDoTask) = toDoDao.deleteTask(toDoTask)

    suspend fun deleteAllTasks() = toDoDao.deleteAll()

}