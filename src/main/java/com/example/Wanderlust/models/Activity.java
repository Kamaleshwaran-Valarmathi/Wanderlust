package com.example.Wanderlust.models;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Activity extends BaseModel {
    private String name;
    private String description;
    private int cost;
    private int capacity;


    public Activity(long id, String name, String description, int cost, int capacity) {
        super(id);
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
    }
}
