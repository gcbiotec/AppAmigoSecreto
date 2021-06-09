package com.example.appamigosecreto.repository

import androidx.annotation.WorkerThread
import com.example.appamigosecreto.infra.database.ParticipanteDAO
import com.example.appamigosecreto.model.Participante

class ParticipanteRepository(private val participanteDAO: ParticipanteDAO){

    var selectedParticipante: Participante? = null

    fun getParticipantes() = participanteDAO.getAllParticipantes()

    @WorkerThread
    suspend fun save(participante: Participante){
        participanteDAO.save(participante)
    }

    suspend fun deleteParticipante(participante: Participante){
        this.participanteDAO.delete(participante)
    }
}
