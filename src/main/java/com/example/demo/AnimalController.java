package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * StudentController.java.
 * Includes all REST API endpoint mappings for the Student object.
 */
@RestController
@RequestMapping("/animals")
public class AnimalController {

    @Autowired
    private AnimalService service;

    /**
     * Get a list of all Students in the database.
     * http://localhost:8080/students/all
     *
     * @return a list of Students  objects.
     */
    @GetMapping("/all")
    public Object getAllAnimals() {
        return new ResponseEntity<>(service.getAllAnimals(), HttpStatus.OK);

    }
    @GetMapping("/african")
    public Object getAllAnimalsWithAfrican(@RequestParam(name = "African", defaultValue = "") String name) {
        return new ResponseEntity<>(service.getAllAnimalsWithAfrican(name), HttpStatus.OK);

    }

    /**
     * Get a specific Student by Id.
     * http://localhost:8080/students/2
     *
     * @param animalId the unique Id for a Student.
     * @return One Student object.
     */
    @GetMapping("/{animalId}")
    public Object getOneAnimal(@PathVariable int animalId) {
        return new ResponseEntity<>(service.getAnimalById(animalId), HttpStatus.OK);

    }


    /**
     * Get a list of students with a name that contains the given string.
     * http://localhost:8080/students/name?search=alex
     *
     * @param search the search key
     * @return list of Student objects matching the search key.
     */
    @GetMapping("/name")
    public Object getAnimalsByName(@RequestParam(name = "search", defaultValue = "") String search) {
        return new ResponseEntity<>(service.getAnimalsByName(search), HttpStatus.OK);

    }

    /**
     * Get a list of Students based on their major.
     * http://localhost:8080/students/major/csc
     *
     * @param description the search key.
     * @return A list of Student objects matching the search key.
     */
    @GetMapping("/description/{description}")
    public Object getAnimalsByDescription(@PathVariable String description) {
        return new ResponseEntity<>(service.getAnimalsByDescription(description), HttpStatus.OK);
    }


    /**
     * Get a list of students with a GPA above a threshold.
     * http://localhost:8080/students/honors?gpa=3.6
     *
     * @param age the minimum GPA
     * @return list of Student objects matching the search key.
     */
    @GetMapping("/number")
    public Object getAnimalsAge(@RequestParam(name = "age", defaultValue = "30") int age) {
        return new ResponseEntity<>(service.getAnimalsAge(age), HttpStatus.OK);

    }

    /**
     * Create a new Student entry.
     * http://localhost:8080/students/new --data '{  "name": "sample new student", "major": "csc", "gpa": 3.55}'
     *
     * @param animal the new Student object.
     * @return the updated list of Students.
     */
    @PostMapping("/new")
    public Object addNewAnimal(@RequestBody Animals animal) {
        service.addNewAnimal(animal);
        return new ResponseEntity<>(service.getAllAnimals(), HttpStatus.CREATED);

    }

    /**
     * Update an existing Student object.
     * http://localhost:8080/students/update/2 --data '{ "studentId": 1, "name": "sampleUpdated", "major": "csc", "gpa": 3.92}'
     *
     * @param animalId the unique Student Id.
     * @param animal   the new update Student details.
     * @return the updated Student object.
     */
    @PutMapping("/update/{animalId}")
    public Object updateAnimal(@PathVariable int animalId, @RequestBody Animals animal) {
        service.updateAnimal(animalId, animal);
        return new ResponseEntity<>(service.getAnimalById(animalId), HttpStatus.CREATED);

    }

    /**
     * Delete a Student object.
     * http://localhost:8080/students/delete/2
     *
     * @param animalId the unique Student Id.
     * @return the updated list of Students.
     */
    @DeleteMapping("/delete/{animalId}")
    public Object deleteAnimalById(@PathVariable int animalId) {
        service.deleteAnimalsById(animalId);
        return new ResponseEntity<>(service.getAllAnimals(), HttpStatus.OK);
    }
}
