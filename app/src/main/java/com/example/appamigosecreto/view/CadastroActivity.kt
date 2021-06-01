package com.example.appamigosecreto.view

import android.app.Activity
import com.example.appamigosecreto.R

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appamigosecreto.viewModel.CadastroViewModel
import android.view.View
import androidx.databinding.DataBindingUtil

class CadastroActivity : AppCompatActivity() {

    private val cadastroViewModel : CadastroViewModel by lazy{
        CadastroViewModel()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityCadastroBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_cadastro)

        binding.viewmodel = cadastroViewModel
    }
    fun cadastrar(view:View){

    }
}