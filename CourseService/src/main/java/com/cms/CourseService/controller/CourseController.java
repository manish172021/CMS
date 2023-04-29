package com.cms.CourseService.controller;

import com.cms.CourseService.model.Course;
import com.cms.CourseService.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cms/course")//pre-path
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping //api/course
    public ResponseEntity<?> saveCourse(@RequestBody Course course) {
        return new ResponseEntity<>(courseService.saveCourse(course), HttpStatus.CREATED);
    }

    @DeleteMapping("{courseId}")//api/course/{courseId}
    public ResponseEntity<?> deleteCourse(@PathVariable Long courseId) {
        courseService.deleteCourse(courseId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping //api/course
    public ResponseEntity<?> getAllCourses() {
        return ResponseEntity.ok(courseService.findAllCourses());
    }

}
