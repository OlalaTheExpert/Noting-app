package com.example.noted.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import com.example.noted.R
import com.example.noted.utils.injectorutils
import com.example.noted.view_model.NotesViewModel
import com.example.noted.view_model.NotesViewModelFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val switchpage2btn: Button = findViewById(R.id.addnotesbtn)
        switchpage2btn.setOnClickListener{
            val intention = Intent(this, Addnotespage::class.java)
            startActivity(intention)
        }



    }
    private fun initializeui(){}
    val factory = injectorutils.provideNotesViewModelFactory()
    val viewModel = ViewModelProvider.of(this, factory).get(NotesViewModel:class.java)

}