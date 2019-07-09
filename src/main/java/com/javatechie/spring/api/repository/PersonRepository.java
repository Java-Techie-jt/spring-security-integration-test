package com.javatechie.spring.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.spring.api.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
