package com.SheSkill.SheSkill.Controller;

import com.SheSkill.SheSkill.Service.EntrepService;
import com.SheSkill.SheSkill.model.entrepreneurship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/idea")
public class EntrepController {

    @Autowired
    EntrepService entrepService;

    @GetMapping("allIdeas")
    public List<entrepreneurship> getAllIdeas()
    {
        return entrepService.getAllIdeas();
    }

    @PostMapping("add")
    public String addIdea(@RequestBody entrepreneurship entrep)
    {
        return entrepService.addIdea(entrep);
    }
    @PutMapping("update")
    public String updateIdea(@RequestBody entrepreneurship entrep)
    {
        return entrepService.updateIdea(entrep);
    }
    @DeleteMapping("delete")
    public String deleteIdea(@RequestBody entrepreneurship entrep)
    {
        return entrepService.deleteIdea(entrep);
    }

}
