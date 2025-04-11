package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * StudentController.java.
 * Includes all REST API endpoint mappings for the Student object.
 */
@Controller
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
    public Object getAllAnimals(Model model) {
        // return new ResponseEntity<>(service.getAllStudents(), HttpStatus.OK);
        model.addAttribute("animal", service.getAllAnimals());
        model.addAttribute("title", "All Animals");
        return "animal-list";

    }




    @GetMapping("/african")
    public Object getAllAnimalsWithAfrican(@RequestParam(name = "African", defaultValue = "") String name, Model model) {
        // return new ResponseEntity<>(service.getAnimalsByName(search), HttpStatus.OK);
        model.addAttribute("animalList", service.getAllAnimalsWithAfrican(name));
        model.addAttribute("title", "Animals With African: " + name);
        return "animal-list";

    }

    /**
     * Get a specific Student by Id.
     * http://localhost:8080/students/2
     *
     * @param animalId the unique Id for a Student.
     * @return One Student object.
     */

    @GetMapping("/{animalId}")
    public Object getOneAnimal(@PathVariable int animalId, Model model) {
        // return new ResponseEntity<>(service.getStudentById(studentId), HttpStatus.OK);
        model.addAttribute("animal", service.getAnimalById(animalId));
        model.addAttribute("title", "Animal #: " + animalId);
        return "animal-details";

    }

    @GetMapping("/animalImg/{animalImg}")
    public Object getAnimalImg(@PathVariable String animalImg, Model model) {
        model.addAttribute("animal", service.getAnimalByImg(animalImg));
        model.addAttribute("title", "Animal Img: " + animalImg);
        return "animal-list";
    }



    /**
     * Get a list of students with a name that contains the given string.
     * http://localhost:8080/students/name?search=alex
     *
     * @param search the search key
     * @return list of Student objects matching the search key.
     */
    @GetMapping("/name")
    public Object getAnimalsByName(@RequestParam(name = "search", defaultValue = "") String search, Model model) {
        // return new ResponseEntity<>(service.getAnimalsByName(search), HttpStatus.OK);
        model.addAttribute("animal", service.getAnimalsByName(search));
        model.addAttribute("title", "Animals by Name: " + search);
        return "animal-list";

    }

    /**
     * Get a list of Students based on their major.
     * http://localhost:8080/students/major/csc
     *
     * @param description the search key.
     * @return A list of Student objects matching the search key.
     */

    @GetMapping("/description/{description}")
    public Object getAnimalsByDescription(@PathVariable String description, Model model) {
        //return new ResponseEntity<>(service.getStudentsByMajor(major), HttpStatus.OK);
        model.addAttribute("animalList", service.getAnimalsByDescription(description));
        model.addAttribute("title", "Animals by Description: " + description);
        return "animal-list";
    }


    /**
     * Get a list of students with a GPA above a threshold.
     * http://localhost:8080/students/honors?gpa=3.6
     *
     * @param age the minimum GPA
     * @return list of Student objects matching the search key.
     */

    @GetMapping("/number")
    public Object getAnimalsAge(@RequestParam(name = "age", defaultValue = "0") int age, Model model) {
        // return new ResponseEntity<>(service.getStudentsByName(search), HttpStatus.OK);
        model.addAttribute("animalList", service.getAnimalsAge(age));
        model.addAttribute("title", "Animals by Age: " + age);
        return "animal-list";

    }
    /**
     * Create a new Student entry.
     * http://localhost:8080/students/new --data '{  "name": "sample new student", "major": "csc", "gpa": 3.55}'
     *
     * @param animal the new Student object.
     * @return the updated list of Students.
     */



    @PostMapping("/new")
    public Object addNewAnimal(Animals animal) {
        service.addNewAnimal(animal);
        // return new ResponseEntity<>(service.getAllStudents(), HttpStatus.CREATED);
        return "redirect:/animals/all";

    }
    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("animal", new Animals());
        model.addAttribute("title", "Add New Animal");
        return "animal-create";
    }

    @GetMapping("/update/{animalId}")
    public String showUpdateForm(@PathVariable int animalId, Model model) {
        model.addAttribute("animal", service.getAnimalById(animalId));
        model.addAttribute("title", "Update Animal");
        return "animal-update";
    }

    /**
     * Update an existing Student object.
     * http://localhost:8080/students/update/2 --data '{ "studentId": 1, "name": "sampleUpdated", "major": "csc", "gpa": 3.92}'
     *
     * @param animalId the unique Student Id.
     * @param animal   the new update Student details.
     * @return the updated Student object.
     */

    @PostMapping("/update/{animalId}")
    public Object updateAnimal(@PathVariable int animalId, Animals animal) {
        service.updateAnimal(animalId, animal);
        //return new ResponseEntity<>(service.getStudentById(studentId), HttpStatus.CREATED);
        return "redirect:/animals/" + animalId;

    }

    /**
     * Delete a Student object.
     * http://localhost:8080/students/delete/2
     *
     * @param animalId the unique Student Id.
     * @return the updated list of Students.
     */

    @GetMapping("/delete/{animalId}")
    public Object deleteAnimalsById(@PathVariable int animalId) {
        service.deleteAnimalsById(animalId);
        // return new ResponseEntity<>(service.getAllStudents(), HttpStatus.OK);
        return "redirect:/animals/all";
    }
}
