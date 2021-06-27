package com.example.noted.repository

import androidx.annotation.WorkerThread
import com.example.noted.data.Notes
import com.example.noted.data.NotesDao

//declaration of the Dao to use only the dao

class NotesRepository(private val NotesDao: NotesDao) {
    fun addNotes(notes: Notes){
        NotesDao.insert()
    }
    fun getNotes(){
        NotesDao.gettitles()
    }


    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(notes: Notes) {
        NotesDao.insert()
    }
}