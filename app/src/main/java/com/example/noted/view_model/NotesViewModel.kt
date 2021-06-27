package com.example.noted.view_model

import androidx.lifecycle.ViewModel
import com.example.noted.data.Notes
import com.example.noted.repository.NotesRepository

class NotesViewModel(private val notesRepository: NotesRepository) :ViewModel(){
    fun getNotes() = notesRepository.getNotes()
    fun addNotes(notes: Notes) = notesRepository.addNotes(notes)
}