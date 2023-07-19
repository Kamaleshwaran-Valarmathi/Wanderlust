package com.example.Wanderlust.db.mapping_classes;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PackageDestination {
    private long packageId;
    private long destinationId;


    public PackageDestination(long packageId, long destinationId) {
        this.packageId = packageId;
        this.destinationId = destinationId;
    }
}
