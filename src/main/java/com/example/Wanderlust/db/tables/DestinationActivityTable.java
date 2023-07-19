package com.example.Wanderlust.db.tables;

import com.example.Wanderlust.db.mapping_classes.DestinationActivity;

import java.util.HashSet;


public class DestinationActivityTable {
    private static final HashSet<DestinationActivity> destinationActivityList = new HashSet<>();


    private DestinationActivityTable() {}


    public static void add(DestinationActivity newDestinationActivity) {
        destinationActivityList.add(newDestinationActivity);
    }


    public static HashSet<DestinationActivity> get() {
        return destinationActivityList;
    }
}
