package com.SheSkill.SheSkill.Controller;

import com.SheSkill.SheSkill.model.users;
import com.SheSkill.SheSkill.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("allUsers")
    public List<users> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @PostMapping("add")
    public String addUser(@RequestBody users user)
    {
        return userService.addUser(user);
    }
    @PutMapping("update")
    public String updateUser(@RequestBody users user)
    {
        return userService.updateUser(user);
    }
    @DeleteMapping("delete")
    public String deleteUser(@RequestBody users user)
    {
        return userService.deleteUser(user);
    }

}

