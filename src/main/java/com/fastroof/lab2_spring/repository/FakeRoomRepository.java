package com.fastroof.lab2_spring.repository;

import com.fastroof.lab2_spring.entity.Room;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
@Getter
@Setter
public class FakeRoomRepository implements RoomRepository {
    private final List<Room> rooms = new ArrayList<>();

    private FakeUserRepository fakeUserRepository;

    @Autowired
    public void setFakeUserRepository(FakeUserRepository fakeUserRepository){
        this.fakeUserRepository = fakeUserRepository;
    }

    public FakeRoomRepository(){
        setFakeUserRepository(new FakeUserRepository());
        rooms.add(new Room(0L, "Test room", "Test room description", "123 Test st.", 2, 50.0, 199, new Date(), fakeUserRepository.getUsers().get(0)));
        rooms.add(new Room(1L, "Test room 2", "Test room 2 description", "321 Test st.", 1, 90.0, 299, new Date(), fakeUserRepository.getUsers().get(1)));
    }
}
