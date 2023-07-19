package com.example.Wanderlust.utils;

import com.example.Wanderlust.db.mapping_classes.DestinationActivity;
import com.example.Wanderlust.db.mapping_classes.PackageDestination;
import com.example.Wanderlust.db.mapping_classes.PackagePassenger;
import com.example.Wanderlust.db.mapping_classes.PassengerActivity;
import com.example.Wanderlust.db.tables.*;
import com.example.Wanderlust.models.Activity;
import com.example.Wanderlust.models.Destination;
import com.example.Wanderlust.models.Package;
import com.example.Wanderlust.models.Passenger;
import com.example.Wanderlust.models.enums.Membership;

public class Init {
    private Init() {}


    private static void populateActivityTable() {
        ActivityTable.add(new Activity(1, "Activity 1", "Description 1", 1, 1));
        ActivityTable.add(new Activity(2, "Activity 2", "Description 2", 2, 2));
        ActivityTable.add(new Activity(3, "Activity 3", "Description 3", 3, 3));
        ActivityTable.add(new Activity(4, "Activity 4", "Description 4", 4, 4));
        ActivityTable.add(new Activity(5, "Activity 5", "Description 5", 5, 5));
        ActivityTable.add(new Activity(6, "Activity 6", "Description 6", 6, 6));
        ActivityTable.add(new Activity(7, "Activity 7", "Description 7", 7, 7));
    }


    private static void populateDestinationTable() {
        DestinationTable.add(new Destination(1, "Destination 1"));
        DestinationTable.add(new Destination(2, "Destination 2"));
        DestinationTable.add(new Destination(3, "Destination 3"));
        DestinationTable.add(new Destination(4, "Destination 4"));
        DestinationTable.add(new Destination(5, "Destination 5"));
        DestinationTable.add(new Destination(6, "Destination 6"));
        DestinationTable.add(new Destination(7, "Destination 7"));
    }


    private static void populatePackageTable() {
        PackageTable.add(new Package(1, "Package 1", 10));
        PackageTable.add(new Package(2, "Package 2", 10));
        PackageTable.add(new Package(3, "Package 3", 10));
        PackageTable.add(new Package(4, "Package 4", 10));
        PackageTable.add(new Package(5, "Package 5", 10));
        PackageTable.add(new Package(6, "Package 6", 10));
        PackageTable.add(new Package(7, "Package 7", 10));
    }


    private static void populatePassengerTable() {
        PassengerTable.add(new Passenger(1L, "Passenger 1", 1L, 100L, Membership.STANDARD));
        PassengerTable.add(new Passenger(2L, "Passenger 2", 2L, 50L, Membership.STANDARD));
        PassengerTable.add(new Passenger(3L, "Passenger 3", 3L, 0L, Membership.PREMIUM));
        PassengerTable.add(new Passenger(4L, "Passenger 4", 4L, 0L, Membership.PREMIUM));
        PassengerTable.add(new Passenger(5L, "Passenger 5", 5L, 70L, Membership.GOLD));
        PassengerTable.add(new Passenger(6L, "Passenger 6", 6L, 60L, Membership.GOLD));
        PassengerTable.add(new Passenger(7L, "Passenger 7", 7L, 75L, Membership.GOLD));
    }


    private static void populateDestinationActivityTable() {
        DestinationActivityTable.add(new DestinationActivity(1, 1));
        DestinationActivityTable.add(new DestinationActivity(1, 2));

        DestinationActivityTable.add(new DestinationActivity(2, 3));
        DestinationActivityTable.add(new DestinationActivity(2, 4));
        DestinationActivityTable.add(new DestinationActivity(2, 5));

        DestinationActivityTable.add(new DestinationActivity(3, 6));

        DestinationActivityTable.add(new DestinationActivity(4, 7));
        DestinationActivityTable.add(new DestinationActivity(4, 1));

        DestinationActivityTable.add(new DestinationActivity(5, 2));
        DestinationActivityTable.add(new DestinationActivity(5, 3));
        DestinationActivityTable.add(new DestinationActivity(5, 4));
        DestinationActivityTable.add(new DestinationActivity(5, 5));

        DestinationActivityTable.add(new DestinationActivity(6, 6));
        DestinationActivityTable.add(new DestinationActivity(6, 7));

        DestinationActivityTable.add(new DestinationActivity(7, 1));
        DestinationActivityTable.add(new DestinationActivity(7, 2));
        DestinationActivityTable.add(new DestinationActivity(7, 3));
    }


    private static void populatePackageDestinationTable() {
        PackageDestinationTable.add(new PackageDestination(1, 1));
        PackageDestinationTable.add(new PackageDestination(1, 2));
        PackageDestinationTable.add(new PackageDestination(1, 3));

        PackageDestinationTable.add(new PackageDestination(2, 4));

        PackageDestinationTable.add(new PackageDestination(3, 5));
        PackageDestinationTable.add(new PackageDestination(3, 6));

        PackageDestinationTable.add(new PackageDestination(4, 7));

        PackageDestinationTable.add(new PackageDestination(5, 1));
        PackageDestinationTable.add(new PackageDestination(5, 2));
        PackageDestinationTable.add(new PackageDestination(5, 3));
        PackageDestinationTable.add(new PackageDestination(5, 4));

        PackageDestinationTable.add(new PackageDestination(6, 5));
        PackageDestinationTable.add(new PackageDestination(6, 6));
        PackageDestinationTable.add(new PackageDestination(6, 7));

        PackageDestinationTable.add(new PackageDestination(7, 1));
        PackageDestinationTable.add(new PackageDestination(7, 2));
    }


    private static void populatePackagePassengerTable() {
        PackagePassengerTable.add(new PackagePassenger(1, 1));
        PackagePassengerTable.add(new PackagePassenger(1, 2));
        PackagePassengerTable.add(new PackagePassenger(1, 3));
        PackagePassengerTable.add(new PackagePassenger(1, 4));

        PackagePassengerTable.add(new PackagePassenger(2, 5));
        PackagePassengerTable.add(new PackagePassenger(2, 6));
        PackagePassengerTable.add(new PackagePassenger(2, 7));

        PackagePassengerTable.add(new PackagePassenger(3, 1));
        PackagePassengerTable.add(new PackagePassenger(3, 2));
        PackagePassengerTable.add(new PackagePassenger(3, 3));
        PackagePassengerTable.add(new PackagePassenger(3, 4));

        PackagePassengerTable.add(new PackagePassenger(4, 5));
        PackagePassengerTable.add(new PackagePassenger(4, 6));

        PackagePassengerTable.add(new PackagePassenger(5, 7));
        PackagePassengerTable.add(new PackagePassenger(5, 1));
        PackagePassengerTable.add(new PackagePassenger(5, 2));
        PackagePassengerTable.add(new PackagePassenger(5, 3));
        PackagePassengerTable.add(new PackagePassenger(5, 4));

        PackagePassengerTable.add(new PackagePassenger(6, 5));
        PackagePassengerTable.add(new PackagePassenger(6, 6));

        PackagePassengerTable.add(new PackagePassenger(7, 7));
        PackagePassengerTable.add(new PackagePassenger(7, 1));
        PackagePassengerTable.add(new PackagePassenger(7, 2));
    }


    private static void populatePassengerActivityTable() {
        PassengerActivityTable.add(new PassengerActivity(1, 1, 1, 1));
        PassengerActivityTable.add(new PassengerActivity(1, 2, 1, 1));
        PassengerActivityTable.add(new PassengerActivity(1, 6, 6, 3));
        PassengerActivityTable.add(new PassengerActivity(1, 5, 5, 3));
        PassengerActivityTable.add(new PassengerActivity(1, 7, 6, 3));

        PassengerActivityTable.add(new PassengerActivity(2, 3, 2, 1));
        PassengerActivityTable.add(new PassengerActivity(2, 4, 2, 1));

        PassengerActivityTable.add(new PassengerActivity(3, 1, 7, 4));
        PassengerActivityTable.add(new PassengerActivity(3, 2, 7, 4));
        PassengerActivityTable.add(new PassengerActivity(3, 3, 7, 4));
        PassengerActivityTable.add(new PassengerActivity(3, 4, 2, 7));
        PassengerActivityTable.add(new PassengerActivity(3, 5, 2, 7));
        PassengerActivityTable.add(new PassengerActivity(3, 6, 6, 3));
        PassengerActivityTable.add(new PassengerActivity(3, 7, 6, 3));

        PassengerActivityTable.add(new PassengerActivity(4, 1, 4, 2));
        PassengerActivityTable.add(new PassengerActivity(4, 2, 5, 3));
        PassengerActivityTable.add(new PassengerActivity(4, 3, 5, 3));
        PassengerActivityTable.add(new PassengerActivity(4, 1, 1, 5));
        PassengerActivityTable.add(new PassengerActivity(4, 4, 2, 5));
        PassengerActivityTable.add(new PassengerActivity(4, 3, 2, 5));

        PassengerActivityTable.add(new PassengerActivity(5, 2, 5, 3));
        PassengerActivityTable.add(new PassengerActivity(5, 5, 5, 3));
        PassengerActivityTable.add(new PassengerActivity(5, 1, 1, 2));
        PassengerActivityTable.add(new PassengerActivity(5, 7, 7, 2));

        PassengerActivityTable.add(new PassengerActivity(6, 3, 5, 6));
        PassengerActivityTable.add(new PassengerActivity(6, 2, 5, 6));
        PassengerActivityTable.add(new PassengerActivity(6, 7, 6, 6));
        PassengerActivityTable.add(new PassengerActivity(6, 5, 5, 6));
        PassengerActivityTable.add(new PassengerActivity(6, 1, 4, 5));

        PassengerActivityTable.add(new PassengerActivity(7, 1, 5, 1));
        PassengerActivityTable.add(new PassengerActivity(7, 4, 5, 2));
        PassengerActivityTable.add(new PassengerActivity(7, 3, 5, 5));
    }


    public static void populateAllTables() {
        populateActivityTable();
        populateDestinationTable();
        populatePackageTable();
        populatePassengerTable();

        populateDestinationActivityTable();
        populatePackageDestinationTable();
        populatePackagePassengerTable();
        populatePassengerActivityTable();
    }
}
