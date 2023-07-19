package com.example.Wanderlust.db.mapping_classes;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PassengerActivity {
    private long passengerId;
    private long activityId;
    private long destinationId;
    private long packageId;


    public PassengerActivity(long passengerId, long activityId, long destinationId, long packageId) {
        this.passengerId = passengerId;
        this.activityId = activityId;
        this.destinationId = destinationId;
        this.packageId = packageId;
    }
}
