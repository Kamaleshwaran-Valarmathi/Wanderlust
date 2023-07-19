package com.example.Wanderlust.models;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BaseModel {
    private long id;


    public BaseModel(long id) {
        this.id = id;
    }
}
