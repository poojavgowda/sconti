package com.pooja.twitter.resolver;

import com.pooja.twitter.Service.UserService;
import com.pooja.twitter.model.User;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class UserResolver implements GraphQLQueryResolver, GraphQLMutationResolver {
    @Autowired
    UserService userService;

    public List<User> getAll(){
        return userService.getAll();
    }
}
