package com.example.gradprogram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText: EditText = findViewById(R.id.editText)

        val helloText: TextView = findViewById(R.id.textView)
        helloText.text = "Grad program"

        val openBtn: Button = findViewById(R.id.openButton)
        openBtn.setOnClickListener {
//            Toast.makeText(this, R.string.sample_text, Toast.LENGTH_SHORT).show()

            val intent = Intent(this, ActivityB::class.java)
            intent.putExtra("string", editText.text.toString())
            startActivity(intent)
        }
    }
}