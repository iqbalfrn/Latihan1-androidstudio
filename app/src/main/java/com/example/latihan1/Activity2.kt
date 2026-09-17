package com.example.latihan1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val textResult = findViewById<TextView>(R.id.textResult)

        val textInput = intent.getStringExtra("TEXT_INPUT")

        textResult.text = """
            NIM: 245150407111013
            Nama: Maulana Iqbal Fernanda
            
            $textInput
        """.trimIndent()
    }
}