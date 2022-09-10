package com.fastroof.lab2_spring.controller;

import com.fastroof.lab2_spring.entity.Room;
import com.fastroof.lab2_spring.repository.FakeRoomRepository;
import com.fastroof.lab2_spring.repository.FakeUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RoomController {
    private FakeRoomRepository fakeRoomRepository;
    private FakeUserRepository fakeUserRepository;

    @Autowired
    public RoomController(FakeRoomRepository fakeRoomRepository, FakeUserRepository fakeUserRepository) {
        this.fakeRoomRepository = fakeRoomRepository;
        this.fakeUserRepository = fakeUserRepository;
    }

    @GetMapping("/room/new")
    public String createNewRoom(Model model) {
        Room room = new Room();
        model.addAttribute("room", room);
        return "thymeleaf/room";
    }

    @PostMapping("/room/new")
    public String submitNewRoom(@ModelAttribute Room room) {
        room.setUser(fakeUserRepository.getUsers().get(0));
        fakeRoomRepository.getRooms().add(room);
        return "redirect:../";
    }

}
