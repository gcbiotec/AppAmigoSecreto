package com.example.appamigosecreto.viewModel

import android.content.Context
import android.widget.Toast
import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.lifecycle.ViewModel
import com.example.appamigosecreto.model.Participante
import com.example.appamigosecreto.repository.ParticipanteRepository

class CadastroViewModel(private val participanteRepository: ParticipanteRepository) :
    BaseViewModel() {
//class CadastroViewModel : ViewModel(), Observable {

    @Bindable
    var nome: String = ""

    @Bindable
    var email = ""

    @Bindable
    var telefone: String = ""

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        TODO("Not yet implemented")
    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        TODO("Not yet implemented")
    }

    fun save(context: Context): Boolean {
        return if (nome.isNotBlank()) {
            val participante = Participante(nome)

            this.participanteRepository.save(participante)
        } else {
            Toast.makeText(context, "Nome não pode ser vazio", Toast.LENGTH_LONG).show()
            false
        }
    }
}

