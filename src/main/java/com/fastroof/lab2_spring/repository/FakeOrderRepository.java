package com.fastroof.lab2_spring.repository;


import com.fastroof.lab2_spring.entity.Order;
import com.fastroof.lab2_spring.entity.User;
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
    @Autowired
    private FakeRoomRepository fakeRoomRepository;

    @Autowired
    private FakeUserRepository fakeuserRepository;


    private final List<Order> orders = new ArrayList<>();

    public FakeOrderRepository(){
        orders.add(new Order(fakeuserRepository.getUsers().get(0), fakeRoomRepository.getRooms().get(0), new Date(), new Date(), 444.6) );
        orders.add(new Order(fakeuserRepository.getUsers().get(1), fakeRoomRepository.getRooms().get(1), new Date(), new Date(), 154.6) );
    }





}
