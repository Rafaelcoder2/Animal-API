package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "animals")
public class Animals {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int animalId;

        @Column(nullable = false)
        private String name;

        private String description;

        @Column(nullable = false)
        private int age;

        private String animalImg;

        public Animals(int animalId, String name, String description, int age, String animalImg) {
            this.animalId = animalId;
            this.name = name;
            this.description = description;
            this.age = age;
            this.animalImg= animalImg;
        }

        public Animals(String name, String description, int age) {
            this.name = name;
            this.description = description;
            this.age = age;
            this.animalImg = animalImg;
        }

        //Always include a no-argument constructor.
        public Animals() {
        }

        public int getAnimalId() {
            return animalId;
        }

        public void setAnimalId(int animalId) {
            this.animalId = animalId;
        }

      public String getAnimalImg() {
        return animalImg;
    }

       public void setAnimalImg(int animalId) {
        this.animalImg = animalImg;
    }
        public String getAllAnimalsWithAfrican(String name){return name;}
        public void setAllAnimalsWithAfrican(String name){this.name= "African";}

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

