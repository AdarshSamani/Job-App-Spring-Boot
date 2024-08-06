package com.adarsh.JobApp.controller;

import com.adarsh.JobApp.model.JobPost;
import com.adarsh.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobController {

    private JobService service;

    public JobService getService() {
        return service;
    }
    @Autowired
    public void setService(JobService service) {
        this.service = service;
    }

    @GetMapping({"/","home"})
    public String home(){
        service.load();
        return "home";
    }

    @GetMapping("addjob")
    public String addjob(){
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        service.addJob(jobPost);
        return "success";
    }

    @GetMapping("viewalljobs")
    public String viewalljobs(Model m){
        List<JobPost> jobs = service.getAllJobs();
        m.addAttribute("jobPosts",jobs);
        return "viewalljobs";
    }
}
