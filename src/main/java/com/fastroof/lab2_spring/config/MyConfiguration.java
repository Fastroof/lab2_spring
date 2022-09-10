package com.fastroof.lab2_spring.config;

import com.fastroof.lab2_spring.entity.Order;
import com.fastroof.lab2_spring.repository.FakeUserRepository;
import com.fastroof.lab2_spring.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfiguration {
    //Singleton
    @Bean
    @Scope("singleton")
    public UserRepository userRepository() {
        return new FakeUserRepository();
    }

    //prototype
    @Bean
    @Scope("prototype")
    public Order order() {
        return new Order();
    }


}

