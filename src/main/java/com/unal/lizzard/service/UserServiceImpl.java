package com.unal.lizzard.service;

import com.unal.lizzard.model.User;
import com.unal.lizzard.repository.UserRepository;
import com.unal.lizzard.web.UserRegistrationDto;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(
                registrationDto.getFirstName(),
                registrationDto.getLastName(),
                registrationDto.getEmail(),
                registrationDto.getPassword(),
                registrationDto.getRole()

        );
        return userRepository.save(user);
    }
}
