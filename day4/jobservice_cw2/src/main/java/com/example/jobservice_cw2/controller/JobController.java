package com.example.jobservice_cw2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.jobservice_cw2.model.Job;
import com.example.jobservice_cw2.service.JobService;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class JobController {

    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @PostMapping("/api/job")
    public ResponseEntity postMethodName(@RequestBody Job job) {

        Job j = jobService.saveJobDetail(job);
    
        return new ResponseEntity<>(j,HttpStatus.CREATED);
    }

    @GetMapping("/api/job")
    public List<Job> getAllDetail() {
        return jobService.getAllJobs();
    }


    @GetMapping("/api/job/{JobId}")
    public Optional<Job> getDetailById(@PathVariable int JobId) {
        return jobService.getJobById(JobId);
    }
}
