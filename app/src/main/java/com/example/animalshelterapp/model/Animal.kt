package com.example.animalshelterapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "animal")
data class Animal(
        @PrimaryKey(autoGenerate = true) val id: Int = 0,
        val species: String,
        val breed: String,
        val age: Int,
        val medicalHistory: String,
        val adoptionStatus: Boolean,
        val isLost: Boolean
)