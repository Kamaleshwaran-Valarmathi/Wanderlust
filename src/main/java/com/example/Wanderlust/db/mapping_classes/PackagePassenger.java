package com.example.Wanderlust.db.mapping_classes;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PackagePassenger {
    private long packageId;
    private long passengerId;


    public PackagePassenger(long packageId, long passengerId) {
        this.packageId = packageId;
        this.passengerId = passengerId;
    }
}
