package com.fastroof.lab2_spring.repository;

import com.fastroof.lab2_spring.entity.Room;
import com.fastroof.lab2_spring.entity.RoomConfiguration;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository {
    Room findByRoomConfiguration(RoomConfiguration roomConfiguration);
    Room findById(Long id);
}
