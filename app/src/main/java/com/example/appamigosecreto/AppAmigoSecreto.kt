package com.example.appamigosecreto

import android.app.Application
import com.example.appamigosecreto.infra.database.BCDatabase
import com.example.appamigosecreto.model.Participante
import com.example.appamigosecreto.repository.ParticipanteRepository

class AppAmigoSecreto : Application() {

    val database by lazy { BCDatabase.getDatabase(this) }

    val participanteRepository by lazy {
        ParticipanteRepository(database.participanteDao())
    }
}