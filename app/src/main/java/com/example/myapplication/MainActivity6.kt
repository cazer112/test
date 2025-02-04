package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity6 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main6)

        val prod = findViewById<RecyclerView>(R.id.spisok)
        prod.adapter = CategoryAdapter4(this, listOf(0, 1, 2, 3, 4, 5, 6, 7))


        val linearLayout2 = findViewById<LinearLayout>(R.id.sneakers2)
        linearLayout2.setOnClickListener{

            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

    }

}



