package com.frank.repository;

import com.frank.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

    //find all courses by category

}
