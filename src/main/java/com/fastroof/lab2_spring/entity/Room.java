package com.fastroof.lab2_spring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    private Long id;
    private String name;
    private String description;
    private String address;
    private Integer bedroomCount;
    private Double area;
    private Integer price;
    private Date creationDate;
    private User user;
}
