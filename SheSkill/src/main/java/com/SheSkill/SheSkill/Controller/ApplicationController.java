package com.SheSkill.SheSkill.Controller;

import com.SheSkill.SheSkill.Service.ApplicationService;
import com.SheSkill.SheSkill.model.applications;
import com.SheSkill.SheSkill.model.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/application")
public class ApplicationController {

    @Autowired
    ApplicationService applicationService;

    @GetMapping("allApplications")
    public List<applications> getAllApplications()
    {
        return applicationService.getAllApplications();
    }

    @PostMapping("add")
    public String addApplication(@RequestBody applications application)
    {
        return applicationService.addApplication(application);
    }
    @PutMapping("update")
    public String updateApplication(@RequestBody applications application)
    {
        return applicationService.updateApplication(application);
    }
    @DeleteMapping("delete")
    public String deleteApplication(@RequestBody applications application)
    {
        return applicationService.deleteApplication(application);
    }


}
