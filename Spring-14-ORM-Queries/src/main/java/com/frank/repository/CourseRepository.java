package com.frank.repository;

import com.frank.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Stream;

public interface CourseRepository extends JpaRepository<Course, Long> {

    //find all courses by category
    List<Course> findByCategory(String category);

    //find all courser by category and order the entities by name
    List<Course> findByCategoryOrderByName(String category);

    //checks if a course with the provided name exists, return true of course exists, false otherwise
    boolean existsByName(String name);

    //returns the count of courses for the provided category
    int countByCategory(String category);

    //find all courses that start with the provided name
    List<Course> findByNameStartsWith(String name);

    //find all courses by category and returns a stream
    Stream<Course> streamByCategory(String category);



}
