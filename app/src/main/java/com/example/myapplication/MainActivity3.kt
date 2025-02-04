package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import java.util.TreeMap

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)



        val linearLayout = findViewById<LinearLayout>(R.id.sneakers)
        linearLayout.setOnClickListener{

            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)




        }
        val linearLayout2 = findViewById<LinearLayout>(R.id.sneakers2)
        linearLayout2.setOnClickListener{

            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)



        }
        val TextView = findViewById<TextView>(R.id.all)
        TextView.setOnClickListener{

            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)



        }

        val imageView = findViewById<ImageView>(R.id.korzina)
        imageView.setOnClickListener{

            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)



        }







        val fil = findViewById<RecyclerView>(R.id.filterss)
        fil.adapter=CategoryAdapter(this, listOf("Все","Outdoor","Tennis"))


    }


}