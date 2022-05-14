package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SelectDeck : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_deck)

        val buttonClick = findViewById<Button>(R.id.buttonmain)
        buttonClick.setOnClickListener {
            val intent = Intent(this, Playground::class.java)
            startActivity(intent)
        }
    }
}