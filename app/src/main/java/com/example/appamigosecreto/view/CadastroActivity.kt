package com.example.appamigosecreto.view

import com.example.appamigosecreto.R

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.appamigosecreto.viewModel.CadastroViewModel
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.appamigosecreto.AppAmigoSecreto
import com.example.appamigosecreto.databinding.ActivityCadastroBinding
import com.example.appamigosecreto.repository.ParticipanteRepository
import com.example.appamigosecreto.viewModel.ParticipanteViewModelFactory

class CadastroActivity : AppCompatActivity() {

    private val cadastroViewModel : CadastroViewModel by viewModels {
        ParticipanteViewModelFactory(application as AppAmigoSecreto)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityCadastroBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_cadastro)

        binding.viewModel = cadastroViewModel
    }

    fun salvarParticipante(view:View){

        this.cadastroViewModel.save()
        this.onBackPressed()
    }

}