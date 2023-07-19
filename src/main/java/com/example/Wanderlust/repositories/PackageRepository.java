package com.example.Wanderlust.repositories;

import com.example.Wanderlust.db.tables.PackageTable;
import com.example.Wanderlust.models.Package;

import java.util.HashSet;


public class PackageRepository {
    public Package getPackageById(long packageId) {
        HashSet<Package> packageTable = PackageTable.get();
        for (Package curPackage: packageTable) {
            if (curPackage.getId() == packageId) {
                return curPackage;
            }
        }
        return null;
    }
}
