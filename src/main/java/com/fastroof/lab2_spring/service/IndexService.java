package com.fastroof.lab2_spring.service;

import com.fastroof.lab2_spring.entity.Order;
import com.fastroof.lab2_spring.entity.Room;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IndexService {
    List<Room> getAllRooms();
    List<Order> getAllOrders();
}
