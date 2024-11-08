package com.rahul.JobApp.Controller;

import com.rahul.JobApp.Model.JobPost;
import com.rahul.JobApp.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService jobService;

    @RequestMapping({"/","/home"})
    public String home() {
        return "home";
    }

    @RequestMapping("/addjob")
    public String addJob() {
        return "addjob";
    }

    @PostMapping("/handleForm")
    public String handleForm(JobPost jobPost) {
        jobService.addJob(jobPost);
        return "success";
    }

    @GetMapping("viewalljobs")
    public String viewJobs(Model mv){
        List<JobPost> jobPosts = jobService.getAllJobs();
        mv.addAttribute("jobPosts",jobPosts);
        return "viewalljobs";
    }
}
