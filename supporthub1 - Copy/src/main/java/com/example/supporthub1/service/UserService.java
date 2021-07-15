package com.example.supporthub1.service;


//import com.example.supporthub1.repository.UserRepository;
import com.example.supporthub1.model.User;
import com.example.supporthub1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public List<User> getAllUsers() {
        List<User> users=new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;


    }


    public void addUser(User user) {
         userRepository.save(user);
    }

    public void updateUser(Long id, User user) {
        userRepository.save(user);
    }
}
