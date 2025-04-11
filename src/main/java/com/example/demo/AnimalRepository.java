package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Provides the actual database transactions.
 */
@Repository
public interface AnimalRepository extends JpaRepository<Animals, Integer> {

    List<Animals> getAnimalsByDescription(String description);

    @Query(value = "select * from animals a where a.age >= ?1", nativeQuery = true)
    List<Animals> getAnimalsAge(int age);

    @Query(value = "select * from animals a where a.name like %?1% ", nativeQuery = true)
    List<Animals> getAnimalsByName(String name);

    @Query(value = "select * from animals a where a.name like %?1% ", nativeQuery = true)
    List<Animals> getAnimalByImg(String animalImg);

    @Query(value = "African", nativeQuery = true)
    List<Animals> getAllAnimalsWithAfrican(String name);
}