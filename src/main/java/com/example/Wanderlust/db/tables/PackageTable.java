package com.example.Wanderlust.db.tables;

import com.example.Wanderlust.models.Package;

import java.util.HashSet;


public class PackageTable {
    private static final HashSet<Package> packageList = new HashSet<>();


    private PackageTable() {}


    public static void add(Package newPackage) {
        packageList.add(newPackage);
    }


    public static HashSet<Package> get() {
        return packageList;
    }
}
