package com.akash.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.akash.app.entity.Course;
import com.akash.app.service.CourseService;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String home() {
        return "This is home page";
    }

    // Get all the courses
    @GetMapping("/get_courses")
    public List<Course> getCourses() {
        return courseService.getCourses();
    }

    // Get the course for given courseId
    @GetMapping("/get_course/{courseId}")
    public Course getCourse(@PathVariable String courseId) {
        return courseService.getCourse(Long.parseLong(courseId));
    }

    // Add the course to course table
    @PostMapping("/add_course")
    public Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    // Update the course for given course object
    @PutMapping("/update_course")
    public Course updateCourse(@RequestBody Course course) {
        return courseService.updateCourse(course);
    }
}
