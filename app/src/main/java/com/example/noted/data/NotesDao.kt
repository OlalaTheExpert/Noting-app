package com.example.noted.data

import androidx.room.*

//handles the queries of the application

@Dao
interface NotesDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert()
    @Update
    fun update(notes: Notes)
    @Delete
    fun delete(notes:Notes)
    @Query("SELECT * FROM notes")
    fun gettitles(): List<Notes>


}