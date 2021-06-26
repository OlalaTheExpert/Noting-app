package com.example.noted.data

import androidx.annotation.WorkerThread

//declaration of the Dao to use only the dao

class NotesRepository(private val NotesDao:NotesDao) {
    val allNotes: List<Notes> = NotesDao.gettitles()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(notes: Notes) {
        NotesDao.insert(notes)
    }
}