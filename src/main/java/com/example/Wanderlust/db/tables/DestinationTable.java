package com.example.Wanderlust.db.tables;

import com.example.Wanderlust.models.Destination;

import java.util.HashSet;


public class DestinationTable {
    private static final HashSet<Destination> destinationList = new HashSet<>();


    private DestinationTable() {}


    public static void add(Destination newDestination) {
        destinationList.add(newDestination);
    }


    public static HashSet<Destination> get() {
        return destinationList;
    }
}
