package com.example.Wanderlust.models;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Package extends BaseModel {
    private String name;
    private int capacity;


    public Package(long id, String name, int capacity) {
        super(id);
        this.name = name;
        this.capacity = capacity;
    }
}
