package com.example.course_cw_2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.course_cw_2.model.Course;
import com.example.course_cw_2.repository.CourseRepo;

@Service
public class CourseService {

    private CourseRepo courseRepo;

    public CourseService(CourseRepo courseRepo) {
        this.courseRepo = courseRepo;
    }

    public Course saveCourse(Course course) {

        return courseRepo.save(course);

    }

    public List<Course> getAllCourses() {

        return courseRepo.findAll();
    }

    public List<Course> getByCourses(String name) {
        return courseRepo.findByCourseName(name);
    }
}
