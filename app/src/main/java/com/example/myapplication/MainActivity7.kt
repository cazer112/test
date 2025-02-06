package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity7 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main7)


        val interfaceonckick = object : Interfce1{

            override fun onclick() {
                val intent = Intent(this@MainActivity7, MainActivity4::class.java)
                startActivity(intent)
            }

        }

        val prod = findViewById<RecyclerView>(R.id.product)
        prod.adapter = CategoryAdapter3(this,listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15),interfaceonckick)
        prod.layoutManager = GridLayoutManager(this, 2)
        prod.layoutManager = GridLayoutManager(this, 2)

    }
}