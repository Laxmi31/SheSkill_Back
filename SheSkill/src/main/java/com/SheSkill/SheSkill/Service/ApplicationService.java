package com.SheSkill.SheSkill.Service;

import com.SheSkill.SheSkill.dao.UserDao;
import com.SheSkill.SheSkill.model.applications;
import com.SheSkill.SheSkill.dao.ApplicationDao;
import com.SheSkill.SheSkill.model.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationService {
    @Autowired
    ApplicationDao applicationDao;
    @Autowired
    UserDao userrepo;
    public List<applications> getAllApplications() {
        return applicationDao.findAll();
    }

    public String addApplication(applications application) {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String email = userDetails.getUsername();
        users user=userrepo.findByEmailId(email);
        application.setUserId(user.getId());
        applicationDao.save(application);

        return "Inserted successfully";
    }

    public String updateApplication(applications application) {
        // Retrieve the existing application by its primary key (job_id)
        applications existingApplication = applicationDao.findByJobId(application.getJobId());

        if (existingApplication != null) {
            // Update fields only if they are provided in the 'application' object
            if (application.getApplicationId() != null ) {
                existingApplication.setApplicationId(application.getApplicationId());
            }
            if (application.getStatus() != null && !application.getStatus().isEmpty()) {
                existingApplication.setStatus(application.getStatus());
            }
            if (application.getUserId() != null && application.getUserId()!=0) {
                existingApplication.setUserId(application.getUserId());
            }

            // Save the updated application back to the database
            applicationDao.save(existingApplication);

            return "Updated successfully";
        } else {
            return "Application not found";
        }
    }

    public String deleteApplication(applications application) {
        applicationDao.delete(application);
        return "Deleted successfully";
    }

    public boolean getStatus(Integer jobId) {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String email = userDetails.getUsername();
        users user=userrepo.findByEmailId(email);
        System.out.println(jobId);
        System.out.println(user.getId());
        Optional<applications> application = applicationDao.findByJobIdAndUserId(jobId, user.getId());
        System.out.println("Is application present: " + application.isPresent());

        return application.isPresent();
    }
}
