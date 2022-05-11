package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Empty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClick = findViewById<Button>(R.id.button3)
        buttonClick.setOnClickListener {
            val intent = Intent(this, CreateAccount::class.java)
            startActivity(intent)
        }

        val button2Click = findViewById<Button>(R.id.button2)
        button2Click.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}