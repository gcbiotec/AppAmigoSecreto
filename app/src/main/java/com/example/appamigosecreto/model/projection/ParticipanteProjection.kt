package com.example.appamigosecreto.model.projection

import androidx.room.Embedded
import androidx.room.Relation
import com.example.appamigosecreto.model.Participante

data class ParticipanteProjection(

    @Embedded
    val participante: Participante,

    @Relation(
        parentColumn = "participanteId",
        entityColumn = "idParticipante"
    )
  val responsible: Responsible
)