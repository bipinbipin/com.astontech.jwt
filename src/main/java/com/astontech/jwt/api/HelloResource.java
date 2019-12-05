package com.astontech.jwt.api;

import com.astontech.jwt.models.ApplicationUser;
import com.astontech.jwt.services.ApplicationUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloResource {

    @Autowired
    ApplicationUserService applicationUserService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello Secured Data";
    }

    @GetMapping("/users")
    public List<ApplicationUser> user() {
        return applicationUserService.getAllUsers();
    }
}
