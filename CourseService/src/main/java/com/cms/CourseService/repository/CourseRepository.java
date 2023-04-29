package com.cms.CourseService.repository;

import com.cms.CourseService.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
