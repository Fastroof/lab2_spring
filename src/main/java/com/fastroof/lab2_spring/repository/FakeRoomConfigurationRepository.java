package com.fastroof.lab2_spring.repository;

import com.fastroof.lab2_spring.entity.RoomConfiguration;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Getter
@Setter
public class FakeRoomConfigurationRepository {
    private final List<RoomConfiguration> roomConfigurations = new ArrayList<>();

    public FakeRoomConfigurationRepository(){
        roomConfigurations.add(new RoomConfiguration(80.0, 2, 580));
        roomConfigurations.add(new RoomConfiguration(50.0, 1, 450));
    }
}
