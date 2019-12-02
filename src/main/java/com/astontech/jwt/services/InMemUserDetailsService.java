package com.astontech.jwt.services;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class InMemUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // THIS SHOULD RETURN YOUR USER FROM WHEREVER, LDAP, DB, ETC

        // THIS IS HARDCODED USER "foo" PASS "foo" AND EMPTY LIST OF AUTHORITIES
        return new User("foo", "foo", new ArrayList<>());

    }
}
