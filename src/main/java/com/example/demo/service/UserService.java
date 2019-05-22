package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private List<User> users;

    // Love Java 8
    public List<User> findByUserNameOrEmail(String username) {

        List<User> result = users.stream()
                .filter(x -> x.getUsername().equalsIgnoreCase(username))
                .collect(Collectors.toList());

        return result;

    }

    // Init some users for testing
    @PostConstruct
    private void iniDataForTesting() {

        users = new ArrayList<User>();

        User user1 = new User("levunguyen", "password111", "mkyong@yahoo.com");
        User user2 = new User("nguyen", "password222", "yflow@yahoo.com");
        User user3 = new User("codegym", "password333", "mkyong@yahoo.com");

        users.add(user1);
        users.add(user2);
        users.add(user3);

    }

}