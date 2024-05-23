package com.example.animalshelterapp.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.animalshelterapp.model.Animal

@Database(entities = [Animal::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun animalDao(): AnimalDao
}


