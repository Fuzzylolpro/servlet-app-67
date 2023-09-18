package com.tms.service;

import com.tms.domain.User;
import com.tms.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Boolean createUser() {
        User user = new User();
        user.setLogin("login");
        user.setPassword("password");
        user.setEmail("email");
        user.setAge(Integer.parseInt("age"));
        Boolean isCreated = userRepository.createUser(user);
        return isCreated;
    }
}
