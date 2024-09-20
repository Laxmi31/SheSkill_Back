package com.SheSkill.SheSkill.dao;


import com.SheSkill.SheSkill.model.entrepship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrepDao extends JpaRepository<entrepship,Integer> {
}
