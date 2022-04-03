package com.example.ejerciciocardviewkotlin

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView


class MainActivity : AppCompatActivity() {

    lateinit var card1:CardView
    lateinit var card2:CardView
    lateinit var card3:CardView
    lateinit var card4:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        card1 = findViewById(R.id.card1)
        card2 = findViewById(R.id.card2)
        card3 = findViewById(R.id.card3)
        card4 = findViewById(R.id.card4)


        card1.setOnClickListener {
            Toast.makeText(
                this,
                "Ha seleccionado la Fruta 1",
                Toast.LENGTH_SHORT).show()
        }

        card2.setOnClickListener {
            Toast.makeText(
                this,
                "Ha seleccionado la Fruta 2",
                Toast.LENGTH_SHORT).show()
        }

        card3.setOnClickListener {
            Toast.makeText(
                this,
                "Ha seleccionado la Fruta 3",
                Toast.LENGTH_SHORT).show()
        }

        card4.setOnClickListener {
            Toast.makeText(
                this,
                "Ha seleccionado la Fruta 4",
                Toast.LENGTH_SHORT).show()
        }
    }
}