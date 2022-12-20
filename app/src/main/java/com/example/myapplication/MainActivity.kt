package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.hello_button)
        button.setOnClickListener{
            Log.v("Helloworld","Button clicked!")
            Toast.makeText(this,"Hello to you too!",Toast.LENGTH_LONG).show()
        }


        }
    }
