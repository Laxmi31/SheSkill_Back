package com.SheSkill.SheSkill.Controller;

import com.SheSkill.SheSkill.Service.UserLoginService;
import com.SheSkill.SheSkill.model.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLoginController {

    @Autowired
    private UserLoginService service;


    @PostMapping("/register")
    public users register(@RequestBody users user) {
        return service.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody users user) {

        return service.verify(user);
    }
}
