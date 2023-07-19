package com.example.Wanderlust.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class PassengerDetailsResponseDto {
    private String name;
    private Long number;
    private String balance; // for premium passenger, we have to display infinite
    private List<Activity> signedUpActivityList;


    @Getter
    @Setter
    public static class Activity {
        private String name;
        private String description;
        private Double pricePaid;
        private String destinationName;
        private String packageName;
    }
}
