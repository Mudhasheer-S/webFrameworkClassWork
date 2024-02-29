package com.example.student.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.student.model.Student;
import com.example.student.service.StudentService;

import jakarta.websocket.server.PathParam;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class StudentController {

    private StudentService childrenService;

    public StudentController(StudentService childrenService) {
        this.childrenService = childrenService;
    }

    @PostMapping("/api/student")
    public ResponseEntity postMethodName(@RequestBody Student children) {

        return childrenService.saveChildrenDetail(children);
    }

    @GetMapping("/api/student/sort")
    public List<Student> getMethodName(@RequestParam("pageNo") int pageNo, @RequestParam("pageSize") int pageSize,
            @RequestParam("sortBy") String sortBy) {

        return childrenService.getPageSortList(pageNo, pageSize, sortBy);
    }

    @GetMapping("/api/student")
    public List<Student> getMethodName(@RequestParam("pageNo") int pageNo, @RequestParam("pageSize") int pageSize) {
        return childrenService.getPageList(pageNo, pageSize);
    }

}
