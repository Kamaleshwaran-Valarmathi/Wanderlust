package com.example.Wanderlust.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class PassengersListResponseDto {
    private String packageName;
    private int passengerCapacity;
    private int enrolledPassengersCount;
    private List<Passenger> passengerList;


    @Getter
    @Setter
    public static class Passenger {
        private String name;
        private long number;
    }
}
