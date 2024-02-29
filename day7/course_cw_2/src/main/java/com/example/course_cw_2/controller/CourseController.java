package com.example.course_cw_2.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.course_cw_2.model.Course;
import com.example.course_cw_2.service.CourseService;

@RestController
public class CourseController {

    private CourseService PersonService;

    public CourseController(CourseService personService) {
        this.PersonService = personService;
    }

    @PostMapping("/api/course")
    public ResponseEntity postMethodName(@RequestBody Course person) {

        Course c = PersonService.saveCourse(person);
        return new ResponseEntity<>(c,HttpStatus.CREATED);
    }

    @GetMapping("/api/course")
    public List<Course> getAllDetail() {
        return PersonService.getAllCourses();
    }

    @GetMapping("/api/course/byAge")
    public List<Course> getDetailByAge(@RequestParam("age") String course) {
        return PersonService.getByCourses(course);
    }
}
