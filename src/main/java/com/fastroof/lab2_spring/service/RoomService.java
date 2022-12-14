package com.fastroof.lab2_spring.service;

import com.fastroof.lab2_spring.entity.Room;
import org.springframework.stereotype.Service;

@Service
public interface RoomService {
    void submitNewRoom(Room room);
    Room getRoomById(Long id);
    void submitEditedRoom(Room room, Long id);
    void deleteRoom(Long id);
}
