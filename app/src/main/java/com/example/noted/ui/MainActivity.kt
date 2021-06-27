package com.example.noted.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.noted.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val switchpage2btn: Button = findViewById(R.id.addnotesbtn)
        switchpage2btn.setOnClickListener{
            val intention = Intent(this, addnotespage::class.java)
            startActivity(intention)
        }



    }
}