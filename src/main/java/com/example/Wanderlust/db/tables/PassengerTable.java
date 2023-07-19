package com.example.Wanderlust.db.tables;

import com.example.Wanderlust.models.Passenger;

import java.util.HashSet;


public class PassengerTable {
    private static final HashSet<Passenger> passengerList = new HashSet<>();


    private PassengerTable() {}


    public static void add(Passenger newPassenger) {
        passengerList.add(newPassenger);
    }


    public static HashSet<Passenger> get() {
        return passengerList;
    }
}
