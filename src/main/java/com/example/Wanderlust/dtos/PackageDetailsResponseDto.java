package com.example.Wanderlust.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class PackageDetailsResponseDto {
    private String packageName;
    private List<Destination> destinationList;


    @Getter
    @Setter
    public static class Destination {
        private String name;
        private List<Activity> activityList;


        @Getter
        @Setter
        public static class Activity {
            private String name;
            private String description;
            private int cost;
            private int capacity;
        }
    }
}
