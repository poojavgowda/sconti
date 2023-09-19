package com.pooja.twitter.Service.impl;

import com.pooja.twitter.Service.UserService;
import com.pooja.twitter.model.User;
import com.pooja.twitter.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.getAllUsers();
    }

    public User createUser(User user){
        user.setName("Pooja");
        User userEntity = userRepository.save(user);
        return userEntity;
    }
}
