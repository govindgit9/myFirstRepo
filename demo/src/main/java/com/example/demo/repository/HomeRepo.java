package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Courses;

@Repository
public interface HomeRepo extends CrudRepository<Courses,Integer>{

}
