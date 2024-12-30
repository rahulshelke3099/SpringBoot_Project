package com.rahul.JobApp.Repository;

import com.rahul.JobApp.Model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobPosts = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Software Developer", "Java Developer", 4, Arrays.asList("Java"))
    ));


    public List<JobPost> getAllJobs() {
        return jobPosts;
    }

    public void addjob(JobPost jobPost) {
        jobPosts.add(jobPost);
    }
}
