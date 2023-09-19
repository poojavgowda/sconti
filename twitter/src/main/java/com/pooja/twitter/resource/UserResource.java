package com.pooja.twitter.resource;

import com.pooja.twitter.Service.UserService;
import com.pooja.twitter.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/rest/neo4j/user")

public class UserResource {

    UserService userService;

    @GetMapping
    public Collection<User> getAll() {
        return userService.getAll();
    }
}
