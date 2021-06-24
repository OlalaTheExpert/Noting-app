package com.example.noted.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class Notes(
    @PrimaryKey
    val id : Int,
    @ColumnInfo(name = "title")
    val title:String,
    @ColumnInfo(name="body")
    val body:String,
)