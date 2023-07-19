package com.example.Wanderlust.repositories;

import com.example.Wanderlust.db.mapping_classes.PackageDestination;
import com.example.Wanderlust.db.tables.DestinationTable;
import com.example.Wanderlust.db.tables.PackageDestinationTable;
import com.example.Wanderlust.models.Destination;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class DestinationRepository {
    public Destination getDestinationById(Long destinationId) {
        HashSet<Destination> destinationTable = DestinationTable.get();
        for (Destination destination: destinationTable) {
            if (destination.getId() == destinationId) {
                return destination;
            }
        }
        return null;
    }


    public List<Destination> getDestinationsByPackageId(long packageId) {
        HashSet<Long> destinationIds = new HashSet<>();
        HashSet<PackageDestination> packageDestinationTable = PackageDestinationTable.get();
        for (PackageDestination packageDestination: packageDestinationTable) {
            if (packageDestination.getPackageId() == packageId) {
                destinationIds.add(packageDestination.getDestinationId());
            }
        }

        List<Destination> destinationList = new ArrayList<>();
        HashSet<Destination> destinationTable = DestinationTable.get();
        for (Destination destination: destinationTable) {
            if (destinationIds.contains(destination.getId())) {
                destinationList.add(destination);
            }
        }

        return destinationList;
    }
}
