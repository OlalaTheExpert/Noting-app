package com.example.noted.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room

@Database(entities = arrayOf(Notes::class),version = 1,exportSchema = false)
public abstract class NotesRoomDatabase {
    abstract fun notesDao():NotesDao
    companion object{
        @Volatile
        private var INSTANCE:NotesRoomDatabase ? = null
        fun getdatabase(context: Context):NotesRoomDatabase{
            //if the instance is not null return it else create a database
            return INSTANCE
                ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    NotesRoomDatabase::class.java,
                    "notes_database",
                ).build()
                    INSTANCE = instance
                    instance



            }
        }
    }
}