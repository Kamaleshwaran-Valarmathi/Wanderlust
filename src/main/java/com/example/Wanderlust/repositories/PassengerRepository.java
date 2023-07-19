package com.example.Wanderlust.repositories;

import com.example.Wanderlust.db.mapping_classes.PackagePassenger;
import com.example.Wanderlust.db.mapping_classes.PassengerActivity;
import com.example.Wanderlust.db.tables.PackagePassengerTable;
import com.example.Wanderlust.db.tables.PassengerActivityTable;
import com.example.Wanderlust.db.tables.PassengerTable;
import com.example.Wanderlust.models.Passenger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class PassengerRepository {
    public Passenger getPassengerById(long passengerId) {
        HashSet<Passenger> passengerTable = PassengerTable.get();
        for (Passenger passenger: passengerTable) {
            if (passenger.getId() == passengerId) {
                return passenger;
            }
        }
        return null;
    }


    public List<Passenger> getPassengersByPackageId(Long packageId) {
        HashSet<Long> passengerIds = new HashSet<>();
        HashSet<PackagePassenger> packagePassengerTable = PackagePassengerTable.get();
        for (PackagePassenger packagePassenger: packagePassengerTable) {
            if (packagePassenger.getPackageId() == packageId) {
                passengerIds.add(packagePassenger.getPassengerId());
            }
        }

        List<Passenger> passengerList = new ArrayList<>();
        HashSet<Passenger> passengerTable = PassengerTable.get();
        for (Passenger passenger: passengerTable) {
            if (passengerIds.contains(passenger.getId())) {
                passengerList.add(passenger);
            }
        }

        return passengerList;
    }


    public List<PassengerActivity> getPassengerActivityListByPassengerId(Long passengerId) {
        List<PassengerActivity> passengerActivityList = new ArrayList<>();
        HashSet<PassengerActivity> passengerActivityTable = PassengerActivityTable.get();
        for (PassengerActivity passengerActivity: passengerActivityTable) {
            if (passengerActivity.getPassengerId() == passengerId) {
                passengerActivityList.add(passengerActivity);
            }
        }
        return passengerActivityList;
    }
}
