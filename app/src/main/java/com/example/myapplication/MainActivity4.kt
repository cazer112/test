package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity4() : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)


        val fil = findViewById<RecyclerView>(R.id.fil)
        fil.adapter=CategoryAdapter2(this, listOf(R.drawable.nike,R.drawable.nike,R.drawable.nike,R.drawable.nike,R.drawable.nike,R.drawable.nike,R.drawable.nike,R.drawable.nike))


    }
}