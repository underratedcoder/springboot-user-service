package com.akash.app.service;

import java.util.List;
import com.akash.app.dao.CourseDao;
import com.akash.app.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;

	public CourseServiceImpl() { }
	
	@Override
	public Course getCourse(long courseId) {
		return courseDao.getOne(courseId);
	}

	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Course addCourse(Course course) {
		return courseDao.save(course);
	}

	@Override
	public Course updateCourse(Course course) {
		 List<Course> courseList = courseDao.findAll();
		courseList.forEach( currentCourse -> {
				if(currentCourse.getCourseId() == course.getCourseId()) {
					currentCourse.setTitle(course.getTitle());
					currentCourse.setDescription(course.getDescription());
				}
			}
		);
		return course;
	}
}
