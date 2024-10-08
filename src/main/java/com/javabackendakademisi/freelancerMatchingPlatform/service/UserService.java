package com.javabackendakademisi.freelancerMatchingPlatform.service;

import com.javabackendakademisi.freelancerMatchingPlatform.entity.User;
import com.javabackendakademisi.freelancerMatchingPlatform.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
