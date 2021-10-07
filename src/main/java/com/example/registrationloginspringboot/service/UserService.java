package com.example.registrationloginspringboot.service;


import com.example.registrationloginspringboot.model.User;
import com.example.registrationloginspringboot.web.dto.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto registrationDto);

}
