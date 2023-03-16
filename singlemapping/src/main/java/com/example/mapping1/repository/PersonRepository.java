package com.example.mapping1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mapping1.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
