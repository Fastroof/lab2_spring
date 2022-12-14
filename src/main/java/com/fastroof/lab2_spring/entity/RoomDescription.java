package com.fastroof.lab2_spring.entity;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RoomDescription {
    private String name;
    private String description;
    private String address;
    private Date creationDate;
}
