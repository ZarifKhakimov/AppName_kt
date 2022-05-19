package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        val button = findViewById<Button>(R.id.b_push)
        button.setOnClickListener { openRecyclerActivity() }
    }

    fun openRecyclerActivity() {
        val intent = Intent(this, Last::class.java)
        startActivity(intent)
    }
}