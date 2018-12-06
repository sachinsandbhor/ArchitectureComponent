package com.ingloriousengineers.architecturecomponent.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [ Tours::class ], version = 1)
abstract class TourDatabase: RoomDatabase() {

    abstract fun tourDao(): TourDao

    companion object {
        val databaseName: String = "TourDB"
        var instance: TourDatabase? = null

        fun getDatabase(context: Context): TourDatabase? {
            if(instance != null) {
                synchronized(TourDatabase::class) {
                    instance = Room.databaseBuilder(context.applicationContext, TourDatabase::class.java, databaseName).build()
                }
            }
            return instance
        }

        fun destroyDatabase() {
            instance = null
        }
    }
}