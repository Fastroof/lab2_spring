package com.fastroof.lab2_spring.repository;

import com.fastroof.lab2_spring.entity.Room;
import com.fastroof.lab2_spring.entity.RoomConfiguration;
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
    private FakeRoomConfigurationRepository fakeRoomConfigurationRepository;
    private FakeRoomDescriptionRepository fakeRoomDescriptionRepository;

    @Autowired
    public void setFakeUserRepository(FakeUserRepository fakeUserRepository){
        this.fakeUserRepository = fakeUserRepository;
    }

    @Autowired
    public void setFakeRoomConfigurationRepository(FakeRoomConfigurationRepository fakeRoomConfigurationRepository){
        this.fakeRoomConfigurationRepository = fakeRoomConfigurationRepository;
    }

    @Autowired
    public void setFakeRoomDescriptionRepository(FakeRoomDescriptionRepository fakeRoomDescriptionRepository){
        this.fakeRoomDescriptionRepository = fakeRoomDescriptionRepository;
    }

    public FakeRoomRepository(){
        setFakeUserRepository(new FakeUserRepository());
        setFakeRoomConfigurationRepository(new FakeRoomConfigurationRepository());
        setFakeRoomDescriptionRepository(new FakeRoomDescriptionRepository());
        rooms.add(new Room(0L, fakeRoomConfigurationRepository.getRoomConfigurations().get(0), fakeRoomDescriptionRepository.getRoomDescriptions().get(0), fakeUserRepository.getUsers().get(0)));
        rooms.add(new Room(1L,  fakeRoomConfigurationRepository.getRoomConfigurations().get(1), fakeRoomDescriptionRepository.getRoomDescriptions().get(1), fakeUserRepository.getUsers().get(1)));
    }

    @Override
    public Room findByRoomConfiguration(RoomConfiguration roomConfiguration) {
        return  rooms.stream().filter(room -> room.getConfiguration().equals(roomConfiguration)).toList().get(0);
    }
}
