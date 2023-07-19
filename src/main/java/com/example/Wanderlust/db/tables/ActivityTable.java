package com.example.Wanderlust.db.tables;

import com.example.Wanderlust.models.Activity;

import java.util.HashSet;


public class ActivityTable {
    private static final HashSet<Activity> activityList = new HashSet<>();


    private ActivityTable() {}


    public static void add(Activity newActivity) {
        activityList.add(newActivity);
    }


    public static HashSet<Activity> get() {
        return activityList;
    }
}
