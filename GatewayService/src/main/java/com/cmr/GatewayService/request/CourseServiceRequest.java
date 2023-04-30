package com.cmr.GatewayService.request;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@FeignClient(value = "course-service"//Name of course-service application
        , path = "/cms/course"//Pre-path for course-service
        // ,url = "${course.service.url}" // commented after eureka enabled
        ,configuration = FeignConfiguration.class
)
public interface CourseServiceRequest {
    @PostMapping///cms/course
    Object saveCourse(@RequestBody Object requestBody);

    @DeleteMapping("{courseId}")//cms/course/{courseId}
    void deleteCourse(@PathVariable("courseId") Long courseId);

    @GetMapping//cms/course
    List<Object> getAllCourses();
}