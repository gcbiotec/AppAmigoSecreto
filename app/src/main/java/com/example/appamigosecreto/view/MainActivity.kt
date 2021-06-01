package com.example.appamigosecreto.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.appamigosecreto.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun adicionar(view: View){

        val intent = Intent(this, CadastroActivity::class.java)
        startActivity(intent)
        finish()
    }
}