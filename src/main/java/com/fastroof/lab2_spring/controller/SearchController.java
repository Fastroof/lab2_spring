package com.fastroof.lab2_spring.controller;

import com.fastroof.lab2_spring.repository.FakeRoomConfigurationRepository;
import com.fastroof.lab2_spring.repository.FakeRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SearchController {

    @Autowired
    private FakeRoomRepository fakeRoomRepository;


    @Autowired
    private FakeRoomConfigurationRepository fakeRoomConfigurationRepository;

    @GetMapping("/search")
    @ResponseBody
    public String search(@RequestParam(required = false) Double area , @RequestParam(required = false) Integer bedroomCount, @RequestParam(required = false) Integer price) {
        return fakeRoomConfigurationRepository.findAllByAreaAndBedroomCountAndPrice(area, bedroomCount, price).toString();
    }
}
