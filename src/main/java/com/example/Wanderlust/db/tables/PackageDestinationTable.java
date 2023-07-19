package com.example.Wanderlust.db.tables;

import com.example.Wanderlust.db.mapping_classes.PackageDestination;

import java.util.HashSet;


public class PackageDestinationTable {
    private static final HashSet<PackageDestination> packageDestinationList = new HashSet<>();


    private PackageDestinationTable() {}


    public static void add(PackageDestination newPackageDestination) {
        packageDestinationList.add(newPackageDestination);
    }


    public static HashSet<PackageDestination> get() {
        return packageDestinationList;
    }
}
