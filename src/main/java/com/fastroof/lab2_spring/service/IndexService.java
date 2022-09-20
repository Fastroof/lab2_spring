package com.fastroof.lab2_spring.service;

import com.fastroof.lab2_spring.entity.Order;
import com.fastroof.lab2_spring.entity.Room;

import java.util.List;

public interface IndexService {
    List<Room> getAllRooms();
    List<Order> getAllOrders();
}
