package com.example.registrationloginspringboot.service;


import com.example.registrationloginspringboot.model.User;
import com.example.registrationloginspringboot.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);

}
