package com.fastroof.lab2_spring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private User user;
    private Room room;
    private Date dateStartContract;
    private Date dateEndContract;
    private Double price;

}
