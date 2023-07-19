package com.example.Wanderlust.db.mapping_classes;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class DestinationActivity {
    private long destinationId;
    private long activityId;


    public DestinationActivity(long destinationId, long activityId) {
        this.destinationId = destinationId;
        this.activityId = activityId;
    }
}
