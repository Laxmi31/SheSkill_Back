package com.SheSkill.SheSkill.dao;

import com.SheSkill.SheSkill.model.applications;
import com.SheSkill.SheSkill.model.users;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ApplicationDao extends JpaRepository<applications,Integer>{

    applications findByJobId(Integer jobId);

   Optional<applications> findByJobIdAndUserId(Integer jobId, Integer userId);
}
