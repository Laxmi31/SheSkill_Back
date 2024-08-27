package com.SheSkill.SheSkill.Controller;

import com.SheSkill.SheSkill.Service.JobService;
import com.SheSkill.SheSkill.model.jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/job")
public class JobController {

    @Autowired
    JobService jobService;

    @GetMapping("allJobs")
    public List<jobs> getAllJobs()
    {
        return jobService.getAllJobs();
    }

    @PostMapping("add")
    public String addJob(@RequestBody jobs job)
    {
        return jobService.addJob(job);
    }
    @PutMapping("update")
    public String updateJob(@RequestBody jobs job)
    {
        return jobService.updateJob(job);
    }
    @DeleteMapping("delete")
    public String deleteJob(@RequestBody jobs job)
    {
        return jobService.deleteJob(job);
    }

}

