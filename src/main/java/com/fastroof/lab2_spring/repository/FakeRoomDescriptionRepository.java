package com.fastroof.lab2_spring.repository;

import com.fastroof.lab2_spring.entity.RoomDescription;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
@Getter
@Setter
public class FakeRoomDescriptionRepository implements RoomDescriptionRepository {
    private final List<RoomDescription> roomDescriptions = new ArrayList<>();

    public FakeRoomDescriptionRepository(){
        roomDescriptions.add(new RoomDescription("Test room 1", "Test desc 1", "123 Test st.", new Date()));
        roomDescriptions.add(new RoomDescription("Test room 2", "Test desc 2", "321 Test st.", new Date()));
    }
}
