package com.example.noted.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.noted.data.Notes
import com.example.noted.repository.NotesRepository
import kotlinx.coroutines.launch

class NotesViewModel(private val repository : NotesRepository) : ViewModel(){
    val allNotes : List<Notes> = repository.allNotes
    //inserting data in a non-blocking way
    fun insert(notes:Notes) = viewModelScope.launch{
        repository.insert(notes)
    }

}

class NotesViewModelFactory(private val repository: NotesRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(NotesViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return NotesViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
