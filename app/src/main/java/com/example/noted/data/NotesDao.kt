package com.example.noted.data

import androidx.room.*
import java.util.*
import java.util.concurrent.Flow
import kotlin.collections.List as List1

@Dao
interface NotesDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(notes:Notes)
    @Update
    fun update(notes: Notes)
    @Delete
    fun delete(notes:Notes)
    @Query("SELECT title FROM notes")
    fun gettitles():List<Notes>

}