package com.SheSkill.SheSkill.Service;

import com.SheSkill.SheSkill.dao.UserLoginDao;
import com.SheSkill.SheSkill.model.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {

    @Autowired
    private JWTService jwtService;

    @Autowired
    AuthenticationManager authManager;

    @Autowired
    private UserLoginDao repo;


    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public users register(users user) {
        System.out.println(user.getEmailId());
        user.setPassword(encoder.encode(user.getPassword()));
        repo.save(user);
        return user;
    }

    public String verify(users user) {
        Authentication authentication = authManager.authenticate(new UsernamePasswordAuthenticationToken(user.getEmailId(), user.getPassword()));
        if (authentication.isAuthenticated()) {
            return jwtService.generateToken(user.getEmailId());
        } else {
            return "fail";
        }
    }
}
