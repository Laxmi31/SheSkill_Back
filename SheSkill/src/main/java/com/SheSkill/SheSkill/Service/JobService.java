package com.SheSkill.SheSkill.Service;

import com.SheSkill.SheSkill.dao.JobDao;
import com.SheSkill.SheSkill.model.jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    JobDao jobDao;
    public List<jobs> getAllJobs() {
        return jobDao.findAll();
    }

    public String addJob(jobs job) {
        jobDao.save(job);
        return "Inserted successfully";
    }

    public String updateJob(jobs job) {
        jobDao.save(job);
        return "Updated successfully";
    }

    public String deleteJob(jobs job) {
        jobDao.delete(job);
        return "Deleted successfully";
    }
}
