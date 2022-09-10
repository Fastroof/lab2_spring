package com.fastroof.lab2_spring.controller;

import com.fastroof.lab2_spring.entity.Room;
import com.fastroof.lab2_spring.entity.RoomConfiguration;
import com.fastroof.lab2_spring.repository.FakeRoomConfigurationRepository;
import com.fastroof.lab2_spring.repository.FakeRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SearchController {

    @Autowired
    private FakeRoomRepository fakeRoomRepository;


    @Autowired
    private FakeRoomConfigurationRepository fakeRoomConfigurationRepository;

    @GetMapping("/search")
    @ResponseBody
    public String search(@RequestParam(required = false) Double area , @RequestParam(required = false) Integer bedroomCount, @RequestParam(required = false) Integer price) {
        List<Room> rooms = new ArrayList<>();
        for (RoomConfiguration roomConfiguration :
                fakeRoomConfigurationRepository.findAllByAreaAndBedroomCountAndPrice(area, bedroomCount, price)
        ){
            rooms.add(fakeRoomRepository.findByRoomConfiguration(roomConfiguration));
        }
        return rooms.toString();
    }
}
