package com.fastroof.lab2_spring.repository;

import com.fastroof.lab2_spring.entity.RoomConfiguration;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomConfigurationRepository{
    List<RoomConfiguration> findAllByAreaAndBedroomCountAndPrice(Double area, Integer bedroomCount, Integer price);
    List<RoomConfiguration> getRoomConfigurations();
}
