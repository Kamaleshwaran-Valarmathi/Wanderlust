package com.example.Wanderlust.db.tables;

import com.example.Wanderlust.db.mapping_classes.PassengerActivity;

import java.util.HashSet;


public class PassengerActivityTable {
    private static final HashSet<PassengerActivity> passengerActivityList = new HashSet<>();


    private PassengerActivityTable() {}


    public static void add(PassengerActivity newPassengerActivity) {
        passengerActivityList.add(newPassengerActivity);
    }


    public static HashSet<PassengerActivity> get() {
        return passengerActivityList;
    }
}
