package com.example.appamigosecreto.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
class Participante(

    @ColumnInfo
    var nome: String,

    @ColumnInfo
    var email: String,

    @ColumnInfo
    var telefone: String,
)

{
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    var idParticipante: Int? = null
}

//annotation class PrimaryKey(val autoGenerate: Boolean)
//
//annotation class ColumnInfo
//
//annotation class Entity
