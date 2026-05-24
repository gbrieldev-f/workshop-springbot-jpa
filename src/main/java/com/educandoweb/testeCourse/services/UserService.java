package com.educandoweb.testeCourse.services;

import com.educandoweb.testeCourse.entities.User;
import com.educandoweb.testeCourse.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        Optional obj = userRepository.findById(id);
        return (User) obj.get();
    }
}
