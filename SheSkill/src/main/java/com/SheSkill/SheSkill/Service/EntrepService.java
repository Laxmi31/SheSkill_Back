package com.SheSkill.SheSkill.Service;

import com.SheSkill.SheSkill.dao.EntrepDao;
import com.SheSkill.SheSkill.dao.UserDao;

import com.SheSkill.SheSkill.model.entrepship;
import com.SheSkill.SheSkill.model.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrepService {
    @Autowired
    EntrepDao entrepDao;
    @Autowired
    UserDao userrepo;
    public List<entrepship> getAllIdeas() {
        return entrepDao.findAll();
    }

    public String addIdea(entrepship entrep) {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String email = userDetails.getUsername();

        users user=userrepo.findByEmailId(email);
        entrep.setPosted_by(user.getId());
        entrepDao.save(entrep);
        return "Inserted successfully";
    }

    public String updateIdea(entrepship entrep) {
        entrepDao.save(entrep);
        return "Updated successfully";
    }

    public String deleteIdea(entrepship entrep) {
        entrepDao.delete(entrep);
        return "Deleted successfully";
    }
}
