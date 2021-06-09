package com.example.appamigosecreto.infra.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.appamigosecreto.model.Participante

@Database(entities = [Participante::class], version = 1, exportSchema = false)
//@TypeConverters(value = [Converters::class])
abstract class BCDatabase : RoomDatabase() {

    abstract fun participanteDao(): ParticipanteDAO

    companion object {

        @Volatile
        private var INSTACE: BCDatabase? = null

        fun getDatabase(context: Context): BCDatabase {
            return INSTACE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    BCDatabase::class.java,
                    "BCDatabase"
                )
                    .fallbackToDestructiveMigration()
                    .build()

                INSTACE = instance
                instance
            }
        }

    }
}