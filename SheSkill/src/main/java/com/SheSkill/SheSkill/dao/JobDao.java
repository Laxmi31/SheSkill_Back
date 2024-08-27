package com.SheSkill.SheSkill.dao;

import com.SheSkill.SheSkill.model.jobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobDao extends JpaRepository<jobs,Integer> {
}
