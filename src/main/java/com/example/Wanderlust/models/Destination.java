package com.example.Wanderlust.models;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Destination extends BaseModel {
    private String name;


    public Destination(long id, String name) {
        super(id);
        this.name = name;
    }
}
