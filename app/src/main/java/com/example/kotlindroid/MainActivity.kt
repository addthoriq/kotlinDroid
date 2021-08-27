package com.example.kotlindroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buton = findViewById(R.id.tombul) as Button

        buton.setOnClickListener{
            Toast.makeText(this@MainActivity, "Berhasil", Toast.LENGTH_LONG).show()
        }
    }
}