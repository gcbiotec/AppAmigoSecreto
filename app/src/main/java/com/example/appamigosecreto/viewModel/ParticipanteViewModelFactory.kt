package com.example.appamigosecreto.viewModel

import android.accounts.AccountManager
import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.appamigosecreto.repository.ParticipanteRepository

class ParticipanteViewModelFactory(val application: AppAmigoSecreto) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CadastroViewModel::class.java)) {
            return CadastroViewModel(application.participanteRepository) as T
        }
        throw IllegalAccessException("Erro desconhecido")
    }
}
