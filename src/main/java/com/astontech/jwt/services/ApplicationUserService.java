package com.astontech.jwt.services;

import com.astontech.jwt.models.ApplicationUser;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApplicationUserService {

    public List<ApplicationUser> getAllUsers() {
        List<ApplicationUser> userList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            userList.add(new ApplicationUser("user" + i, "lastname" + i));
        }
        return userList;
    }
}
