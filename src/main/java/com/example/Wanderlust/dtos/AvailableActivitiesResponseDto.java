package com.example.Wanderlust.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
public class AvailableActivitiesResponseDto {
    List<Activity> availableAcitiviyList = new ArrayList<>();


    @Getter
    @Setter
    public static class Activity {
        private String packageName;
        private String destinationName;
        private String name;
        private String description;
        private int cost;
        private int totalCapacity;
        private int availableCapacity;
    }
}
