package com.example.appamigosecreto.infra.database

import androidx.room.*
import com.example.appamigosecreto.model.Participante
import com.example.appamigosecreto.model.projection.ParticipanteProjection
import java.util.concurrent.Flow


@Dao
interface ParticipanteDAO {

        @Transaction
        @Query("SELECT * FROM Participante ORDER BY nome ASC")
        fun getAllParticipantes(): Flow<List<ParticipanteProjection>>

        @Insert(onConflict = OnConflictStrategy.REPLACE)
        suspend fun save(participante: Participante)

        @Delete
        suspend fun delete(participante: Participante)

    }

}
