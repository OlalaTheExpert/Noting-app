package com.example.noted.data

import androidx.room.Dao
import androidx.room.Query

@Dao
interface NotesDao {
    @Query("SELECT title FROM notes")
    fun getTitles():List<Notes>

}