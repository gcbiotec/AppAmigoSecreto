package com.example.appamigosecreto.viewModel

import android.widget.Toast
import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.databinding.PropertyChangeRegistry
import androidx.lifecycle.ViewModel
import com.example.appamigosecreto.model.Participante
import com.example.appamigosecreto.repository.ParticipanteRepository

class CadastroViewModel(private val participanteRepository: ParticipanteRepository) :
    BaseViewModel(){

    val participanteList = participanteRepository.getParticipantes().asLiveData()


    @Bindable
    var nome: String = ""

    @Bindable
    var email: String = ""

    @Bindable
    var telefone: String = ""

    private val callbacks: PropertyChangeRegistry by lazy { PropertyChangeRegistry() }

//    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
//        callbacks.add(callback)
//    }
//
//    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
//        callbacks.remove(callback)
//    }

    fun save() {
        if (formIsValid()) {
            viewModelScope.launch {

                val participante = if (participanteRepository.selectedParticipante != null) {
                    participanteRepository.selectedParticipante!!.nome = nome
                    participanteRepository.selectedParticipante!!.email = email
                    participanteRepository.selectedParticipante!!.telefone = telefone
                    participanteRepository.selectedParticipante!!.participanteId = participante.idParticipante
                    participanteRepository!!
                } else {
                    Participante(nome, email, telefone)
                }

                participanteRepository.save(participante)
            }
        } else {
            this.errorMessage = "Formulário inválido, confira os campos antes de prosseguir"
        }
    }

    fun formIsValid() : Boolean {
        return nome.isNotBlank() && email.isNotBlank() && telefone.isNotBlank()
    }

    fun deleteParticipante(participante: Participante) = viewModelScope.launch {
        participanteRepository.deleteParticipante(participante)
    }

    fun selectedParticipante(participante: Participante) {
        participanteRepository.selectedParticipante = participante
    }

    fun cleanSelectedAccount() {
        participanteRepository.selectedParticipante = null
    }

}