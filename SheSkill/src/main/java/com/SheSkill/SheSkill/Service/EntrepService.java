package com.SheSkill.SheSkill.Service;

import com.SheSkill.SheSkill.dao.EntrepDao;
import com.SheSkill.SheSkill.model.entrepreneurship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrepService {
    @Autowired
    EntrepDao entrepDao;
    public List<entrepreneurship> getAllIdeas() {
        return entrepDao.findAll();
    }

    public String addIdea(entrepreneurship entrep) {
        entrepDao.save(entrep);
        return "Inserted successfully";
    }

    public String updateIdea(entrepreneurship entrep) {
        entrepDao.save(entrep);
        return "Updated successfully";
    }

    public String deleteIdea(entrepreneurship entrep) {
        entrepDao.delete(entrep);
        return "Deleted successfully";
    }
}
