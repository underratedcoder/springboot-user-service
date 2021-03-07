package com.akash.app.service;

import java.util.List;
import com.akash.app.entity.Course;

public interface CourseService {
    Course getCourse(long CourseId);
    List<Course> getCourses();
    Course addCourse(Course course);
    Course updateCourse(Course course);
}
