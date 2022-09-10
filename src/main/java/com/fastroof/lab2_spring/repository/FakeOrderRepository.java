package com.fastroof.lab2_spring.repository;


import com.fastroof.lab2_spring.entity.Order;
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
public class FakeOrderRepository implements OrderRepository{
    private FakeRoomRepository fakeRoomRepository;
    private FakeUserRepository fakeUserRepository;

    private final List<Order> orders = new ArrayList<>();

    @Autowired
    public FakeOrderRepository(FakeRoomRepository fakeRoomRepository, FakeUserRepository fakeUserRepository){
        this.fakeRoomRepository = fakeRoomRepository;
        this.fakeUserRepository = fakeUserRepository;
        orders.add(new Order(fakeUserRepository.getUsers().get(0), fakeRoomRepository.getRooms().get(0), new Date(), new Date(), 444.6) );
        orders.add(new Order(fakeUserRepository.getUsers().get(1), fakeRoomRepository.getRooms().get(1), new Date(), new Date(), 154.6) );
    }





}
