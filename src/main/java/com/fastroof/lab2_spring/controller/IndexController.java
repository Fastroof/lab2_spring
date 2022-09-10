package com.fastroof.lab2_spring.controller;

import com.fastroof.lab2_spring.repository.FakeUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @Autowired
    private FakeUserRepository fakeUserRepository = new FakeUserRepository();

    @GetMapping("/")
    public String showIndexPage(ModelMap model) {
        model.addAttribute("users", fakeUserRepository.getUsers());
        return "thymeleaf/index";
    }
}
