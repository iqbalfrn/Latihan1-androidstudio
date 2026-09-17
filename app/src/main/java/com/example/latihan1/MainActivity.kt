package com.example.latihan1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextInput = findViewById<EditText>(R.id.editTextInput)
        val buttonClick = findViewById<Button>(R.id.buttonClick)

        buttonClick.setOnClickListener {

            val textInput = editTextInput.text.toString()

            val intent = Intent(this, Activity2::class.java)

            intent.putExtra("TEXT_INPUT", textInput)

            startActivity(intent)
        }
    }
}