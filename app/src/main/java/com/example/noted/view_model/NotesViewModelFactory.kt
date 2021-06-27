package com.example.noted.view_model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.noted.repository.NotesRepository

@Suppress("UNCHECKED_CAST")
class NotesViewModelFactory (private val notesRepository: NotesRepository) :ViewModelProvider.NewInstanceFactory(){
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NotesViewModel(notesRepository) as T
    }
}