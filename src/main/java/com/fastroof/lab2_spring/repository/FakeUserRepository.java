package com.fastroof.lab2_spring.repository;

import com.fastroof.lab2_spring.entity.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Getter
@Setter
public class FakeUserRepository implements UserRepository {
    private final List<User> users = new ArrayList<>();
    public FakeUserRepository() {
        users.add(new User(0L, "john@gmail.com", "12345678", "John", "Bill"));
        users.add(new User(1L, "bob@gmail.com", "87654321", "Bob", "Brown"));
    }

}
