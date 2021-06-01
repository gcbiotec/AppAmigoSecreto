package com.example.appamigosecreto.repository

import com.example.appamigosecreto.model.Participante

class ParticipanteRepository {

    fun getParticipantes() : List<Participante>{

        val participante1 = Participante("Gabriel", "gcbiotec@gmail.com", "4565-45654")
        val participante2 = Participante("Ronaldo", "rfilho@gmail.com", "4565-456887")
        val participante3 = Participante("Isadora", "isa@gmail.com", "45654-7897")

        return listOf(participante1,participante2,participante3)
    }

}