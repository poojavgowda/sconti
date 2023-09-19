package com.pooja.twitter.Service;

import com.pooja.twitter.model.User;
import com.pooja.twitter.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

public interface UserService {
    public List<User> getAll();
    public User createUser(User user);
}
