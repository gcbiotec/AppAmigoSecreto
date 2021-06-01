package com.example.appamigosecreto.view

import android.app.Activity
import com.example.appamigosecreto.R

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appamigosecreto.viewModel.CadastroViewModel
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.appamigosecreto.databinding.ActivityCadastroBinding
import com.example.appamigosecreto.repository.ParticipanteRepository
import com.example.appamigosecreto.viewModel.ParticipanteViewModelFactory

class CadastroActivity : AppCompatActivity() {

    private val cadastroViewModel : CadastroViewModel by lazy {
        CadastroViewModel()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityCadastroBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_cadastro)

        binding.viewModel = cadastroViewModel

        cadastrarParticipante()
    }
//        cadastroViewModel.nome
//        cadastroViewModel.email
//        cadastroViewModel.email

    fun cadastrarParticipante(view:View){

        cadastroViewModel.save()
    }
}