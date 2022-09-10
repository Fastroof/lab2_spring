package com.fastroof.lab2_spring.controller;

import com.fastroof.lab2_spring.repository.FakeRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @Autowired
    private FakeRoomRepository fakeRoomRepository;

    @GetMapping("/")
    public String showIndexPage(ModelMap model) {
        model.addAttribute("rooms", fakeRoomRepository.getRooms());
        return "thymeleaf/index";
    }
}
