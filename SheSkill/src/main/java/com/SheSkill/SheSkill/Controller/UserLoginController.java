package com.SheSkill.SheSkill.Controller;

import com.SheSkill.SheSkill.Service.UserLoginService;
import com.SheSkill.SheSkill.model.LoginResponse;
import com.SheSkill.SheSkill.model.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserLoginController {

    @Autowired
    private UserLoginService service;

    // Register endpoint
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody users user) {
        try {
            users registeredUser = service.register(user);
            if (registeredUser != null) {
                return ResponseEntity.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(Map.of("message", "Signup successful", "user", registeredUser));
            } else {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(Map.of("message", "Signup failed"));
            }
        } catch (Exception e) {
            e.printStackTrace(); // Log the error
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(Map.of("message", "Server error during signup"));
        }
    }
    // Login endpoint
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody users user) {
        try {
            LoginResponse loginResponse = service.verify(user);
            if (loginResponse != null) {
                return ResponseEntity.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(Map.of("message", "Login successful", "token", loginResponse.getToken()));
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(Map.of("message", "Invalid credentials"));
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(Map.of("message", "Login failed due to server error"));
        }
    }
}
