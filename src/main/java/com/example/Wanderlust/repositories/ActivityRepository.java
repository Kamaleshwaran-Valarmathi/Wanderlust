package com.example.Wanderlust.repositories;

import com.example.Wanderlust.db.mapping_classes.DestinationActivity;
import com.example.Wanderlust.db.mapping_classes.PassengerActivity;
import com.example.Wanderlust.db.tables.ActivityTable;
import com.example.Wanderlust.db.tables.DestinationActivityTable;
import com.example.Wanderlust.db.tables.PassengerActivityTable;
import com.example.Wanderlust.models.Activity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class ActivityRepository {
    public Activity getActivityById(Long activityId) {
        HashSet<Activity> activityTable = ActivityTable.get();
        for (Activity activity: activityTable) {
            if (activity.getId() == activityId) {
                return activity;
            }
        }
        return null;
    }


    public List<Activity> getActivitiesByDestinationId(Long destinationId) {
        HashSet<Long> activityIds = new HashSet<>();
        HashSet<DestinationActivity> destinationActivityTable = DestinationActivityTable.get();
        for (DestinationActivity destinationActivity: destinationActivityTable) {
            if (destinationActivity.getDestinationId() == destinationId) {
                activityIds.add(destinationActivity.getActivityId());
            }
        }

        List<Activity> activityList = new ArrayList<>();
        HashSet<Activity> activityTable = ActivityTable.get();
        for (Activity activity: activityTable) {
            if (activityIds.contains(activity.getId())) {
                activityList.add(activity);
            }
        }

        return activityList;
    }


    public HashSet<PassengerActivity> getAllPassengerActivity() {
        return PassengerActivityTable.get();
    }
}
