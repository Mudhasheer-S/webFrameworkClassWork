package com.example.jobservice_cw2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.jobservice_cw2.model.Job;
import com.example.jobservice_cw2.repository.JobRepo;

@Service
public class JobService {
    

    private JobRepo jobRepo;

    public JobService(JobRepo jobRopo) {
        this.jobRepo = jobRopo;
    }

    public Job saveJobDetail(Job job){

        return jobRepo.save(job);
        
    }

    public List<Job> getAllJobs(){
        return jobRepo.findAll();
    }

    public Optional<Job> getJobById(int id){
        return jobRepo.findById(id);
    }
}
