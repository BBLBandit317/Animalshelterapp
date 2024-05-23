package com.example.animalshelterapp.repository

import android.content.Context
import androidx.lifecycle.LiveData
import com.example.animalshelterapp.database.AnimalDao
import com.example.animalshelterapp.database.DatabaseProvider
import com.example.animalshelterapp.model.Animal
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class AnimalRepository(context: Context) {

    private val animalDao: AnimalDao

    init {
        val database = DatabaseProvider.getDatabase(context)
        animalDao = database.animalDao()
    }

    suspend fun getAllAnimals(): List<Animal> {
        return withContext(Dispatchers.IO) {
            animalDao.getAllAnimals()
        }
    }

    suspend fun getAnimalsBySpecies(species: String): List<Animal> {
        return withContext(Dispatchers.IO) {
            animalDao.getAnimalsBySpecies(species)
        }
    }

    suspend fun getAnimalsByAge(age: Int): List<Animal> {
        return withContext(Dispatchers.IO) {
            animalDao.getAnimalsByAge(age)
        }
    }

    suspend fun getAnimalsByAdoptionStatus(status: Boolean): List<Animal> {
        return withContext(Dispatchers.IO) {
            animalDao.getAnimalsByAdoptionStatus(status)
        }
    }

    suspend fun getLostAnimals(isLost: Boolean): List<Animal> {
        return withContext(Dispatchers.IO) {
            animalDao.getLostAnimals(isLost)
        }
    }

    suspend fun insertAnimal(animal: Animal) {
        withContext(Dispatchers.IO) {
            animalDao.insertAnimal(animal)
        }
    }

    suspend fun updateAnimal(animal: Animal) {
        withContext(Dispatchers.IO) {
            animalDao.updateAnimal(animal)
        }
    }
}

private fun Any.animalDao(): AnimalDao {
    TODO("Not yet implemented")
}

class DatabaseProvider {
    companion object {
        fun getDatabase(context: Context): Any {
            TODO("Not yet implemented")
        }
    }

}
