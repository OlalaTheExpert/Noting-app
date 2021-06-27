package com.example.noted.utils

import com.example.noted.data.Notes
import com.example.noted.repository.NotesRepository
import com.example.noted.view_model.NotesViewModelFactory
import java.security.Policy.getInstance
import java.util.Calendar.getInstance

object injectorutils {
    fun provideNotesViewModelFactory(): NotesViewModelFactory{
        val notesRepository = NotesRepository.getInstance(Notes.getInstance().notesDao)
        return NotesViewModelFactory(NotesRepository())
    }

}