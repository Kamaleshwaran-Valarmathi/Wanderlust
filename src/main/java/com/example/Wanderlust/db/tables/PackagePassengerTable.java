package com.example.Wanderlust.db.tables;

import com.example.Wanderlust.db.mapping_classes.PackagePassenger;

import java.util.HashSet;


public class PackagePassengerTable {
    private static final HashSet<PackagePassenger> packagePassengerList = new HashSet<>();


    private PackagePassengerTable() {}


    public static void add(PackagePassenger newPackagePassenger) {
        packagePassengerList.add(newPackagePassenger);
    }


    public static HashSet<PackagePassenger> get() {
        return packagePassengerList;
    }
}
