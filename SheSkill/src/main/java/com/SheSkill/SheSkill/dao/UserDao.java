package com.SheSkill.SheSkill.dao;

import com.SheSkill.SheSkill.model.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<users,Integer> {
    public users findByEmailId(String email);

}
