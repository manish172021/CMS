package com.cms.CourseService.service;

import com.cms.CourseService.model.Course;

import java.util.List;

public interface CourseService {

    Course saveCourse(Course course);

    void deleteCourse(Long courseId);

    List<Course> findAllCourses();
}
