package com.unal.lizzard.service;

import com.unal.lizzard.model.User;

import com.unal.lizzard.repository.UserRepository;
import org.springframework.stereotype.Service;
import com.unal.lizzard.web.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        super();
        this.userRepository = userRepository;
    }



    @Override
    public User save(UserRegistrationDto registrationDto) {

        User user = new User(

                registrationDto.getUsername(),
                registrationDto.getPassword(),
                registrationDto.getRole()

        );
       
        return userRepository.save(user);




    }





}
