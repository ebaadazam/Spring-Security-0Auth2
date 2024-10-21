package com.ebaad.SpringSecurityOAuth2Project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class SecurityController {

    @RequestMapping("/")
    public String home() {
        return "Welcome to Home Page!";
    }

    // This endpoint is only accessible to the logged-in user
    // If some user is logged-in, this Principal user will have the details of that user
    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}
