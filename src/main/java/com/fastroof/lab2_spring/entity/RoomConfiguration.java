package com.fastroof.lab2_spring.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RoomConfiguration {
    private Double area;
    private Integer bedroomCount;
    private Integer price;
}
