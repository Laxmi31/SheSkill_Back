package com.SheSkill.SheSkill.dao;

import com.SheSkill.SheSkill.model.applications;
import com.SheSkill.SheSkill.model.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationDao extends JpaRepository<applications,Integer>{

    applications findByJobId(Integer jobId);
}
