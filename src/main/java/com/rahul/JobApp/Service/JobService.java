package com.rahul.JobApp.Service;

import com.rahul.JobApp.Model.JobPost;
import com.rahul.JobApp.Repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo jobRepo;

    public void addJob(JobPost jobPost) {
        jobRepo.addjob(jobPost);
    }

    public List<JobPost> getAllJobs() {
       return  jobRepo.getAllJobs();
    }


}
