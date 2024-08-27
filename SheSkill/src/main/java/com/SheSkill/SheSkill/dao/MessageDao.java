package com.SheSkill.SheSkill.dao;

import com.SheSkill.SheSkill.model.messages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageDao extends JpaRepository<messages,Integer> {
}
