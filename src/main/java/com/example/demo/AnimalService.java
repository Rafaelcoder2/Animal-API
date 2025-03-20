package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * StudentService.java
 * Centralizes data access to the Student Database.
 */
@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;


    /**
     * Fetch all Students.
     *
     * @return the list of all Students.
     */
    public List<Animals> getAllAnimals() {

        return animalRepository.findAll();
    }
    public List<Animals> getAllAnimalsWithAfrican(String name) {

        return animalRepository.getAllAnimalsWithAfrican(name);
    }

    /**
     * Fetch a unique student.
     *
     * @param animalId the unique Student id.
     * @return a unique Student object.
     */
    public Animals getAnimalById(int animalId) {

        return animalRepository.findById(animalId).orElse(null);
    }

    /**
     * Fetch all students whose major matches the search term.
     *
     * @param description the search key.
     * @return the list of matching Students.
     */
    public List<Animals> getAnimalsByDescription(String description) {

        return animalRepository.getAnimalsByDescription(description);
    }


    /**
     * Fetch all students with a GPA above a threshold.
     *
     * @param age the threshold
     * @return the list of matching Students
     */
    public List<Animals> getAnimalsAge(int age) {

        return animalRepository.getAnimalsAge(age);
    }



    /**
     * Fetch all students with a name that contains the given string.
     *
     * @param name the search name
     * @return the list of matching Students
     */
    public List<Animals> getAnimalsByName(String name) {

        return animalRepository.getAnimalsByName(name);
    }

    /**
     * Add a new Student to the database.
     *
     * @param animal the new Student to add.
     */
    public void addNewAnimal(Animals animal) {

        animalRepository.save(animal);
    }

    /**
     * Update an existing Student.
     *
     * @param animalId the unique Student Id.
     * @param animal   the new Student details.
     */
    public void updateAnimal(int animalId, Animals animal) {
        Animals existing = getAnimalById(animalId);
        existing.setName(animal.getName());
        existing.setDescription(animal.getDescription());
        existing.setAge(animal.getAge());

        //Technically the 4 lines above are not necessary because the save method merges by default.
        animalRepository.save(existing);
    }

    /**
     * Delete a unique Student.
     *
     * @param animalId the unique Student Id.
     */
    public void deleteAnimalsById(int animalId) {

        animalRepository.deleteById(animalId);
    }
}