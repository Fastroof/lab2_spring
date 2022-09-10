package com.fastroof.lab2_spring.repository;

import com.fastroof.lab2_spring.entity.User;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Profile("transient")
public class FakeUserRepository implements UserRepository {

    List<User> users = new ArrayList<>();

    public FakeUserRepository() {
        this.users.add(new User(0L, "john@gmail.com", "12345678", "John", "Bill"));
        this.users.add(new User(1L, "bob@gmail.com", "87654321", "Bob", "Brown"));
    }

}
