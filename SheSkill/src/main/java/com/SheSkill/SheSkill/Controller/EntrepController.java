package com.SheSkill.SheSkill.Controller;

import com.SheSkill.SheSkill.Service.EntrepService;

import com.SheSkill.SheSkill.model.entrepship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/idea")
public class EntrepController {

    @Autowired
    EntrepService entrepService;

    @GetMapping("allIdeas")
    public List<entrepship> getAllIdeas()
    {
        return entrepService.getAllIdeas();
    }

    @PostMapping("add")
    public String addIdea(@RequestBody entrepship entrep)
    {
        return entrepService.addIdea(entrep);
    }
    @PutMapping("update")
    public String updateIdea(@RequestBody entrepship entrep)
    {
        return entrepService.updateIdea(entrep);
    }
    @DeleteMapping("delete")
    public String deleteIdea(@RequestBody entrepship entrep)
    {
        return entrepService.deleteIdea(entrep);
    }

}
