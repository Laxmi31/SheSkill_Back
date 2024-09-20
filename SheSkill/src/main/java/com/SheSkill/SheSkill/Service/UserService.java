package com.SheSkill.SheSkill.Service;

import com.SheSkill.SheSkill.dao.UserDao;
import com.SheSkill.SheSkill.model.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public List<users> getAllUsers() {
        return userDao.findAll();
    }

    public String addUser(users user) {
        userDao.save(user);
        return "Inserted successfully";
    }

    // Register a new user
    public String registerUser(users user) {
        users existingUser = userDao.findByEmailId(user.getEmailId());
        if (existingUser != null) {
            return "User already exists with this email.";
        }
        userDao.save(user);
        return "User registered successfully";
    }

    public String updateUser(users user) {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String email = userDetails.getUsername();
        users existingUser = userDao.findByEmailId(email);

        if (existingUser != null) {
            if (user.getPassword() != null && !user.getPassword().isEmpty()) {
                existingUser.setPassword(user.getPassword());
            }

            if (user.getEmailId() != null && !user.getEmailId().isEmpty()) {
                existingUser.setEmailId(user.getEmailId());
            }


        userDao.save(existingUser);
            return "Updated successfully";
        }
        else
        {
            return "User not found";
        }
    }

    public String deleteUser(users user) {
        userDao.delete(user);
        return "Deleted successfully";
    }
}
