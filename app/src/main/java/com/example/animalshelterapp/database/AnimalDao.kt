package com.example.animalshelterapp.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.animalshelterapp.model.Animal

@Dao
interface AnimalDao {

    @Query("SELECT * FROM animal")
    fun getAllAnimals(): List<Animal>

    @Query("SELECT * FROM animal WHERE species = :species")
    fun getAnimalsBySpecies(species: String): List<Animal>

    @Query("SELECT * FROM animal WHERE age = :age")
    fun getAnimalsByAge(age: Int): List<Animal>

    @Query("SELECT * FROM animal WHERE adoptionStatus = :status")
    fun getAnimalsByAdoptionStatus(status: Boolean): List<Animal>

    @Query("SELECT * FROM animal WHERE isLost = :isLost")
    fun getLostAnimals(isLost: Boolean): List<Animal>

    @Insert
    fun insertAnimal(animal: Animal)

    @Update
    fun updateAnimal(animal: Animal)
}