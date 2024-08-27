package com.SheSkill.SheSkill.dao;

import com.SheSkill.SheSkill.model.entrepreneurship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrepDao extends JpaRepository<entrepreneurship,Integer> {
}
