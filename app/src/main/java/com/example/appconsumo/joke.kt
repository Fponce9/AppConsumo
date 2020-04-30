package com.example.appconsumo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_joke.*

class joke : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_joke)

        btnJoke.setOnClickListener{
            loadJoke()
        }
    }

    private fun loadJoke(){
        txtMostrar.text="Broma encontrada"
    }
}
