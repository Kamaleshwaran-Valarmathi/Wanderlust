package com.example.Wanderlust.services;

import com.example.Wanderlust.dtos.PackageDetailsResponseDto;
import com.example.Wanderlust.models.Destination;
import com.example.Wanderlust.repositories.DestinationRepository;

import java.util.ArrayList;
import java.util.List;


public class DestinationService {
    DestinationRepository destinationRepository = new DestinationRepository();
    ActivityService activityService = new ActivityService();


    public List<PackageDetailsResponseDto.Destination> getDestinationDtoDetailsByPackageId(long packageId) {
        List<PackageDetailsResponseDto.Destination> dtoDestinationList = new ArrayList<>();
        List<Destination> destinationList = destinationRepository.getDestinationsByPackageId(packageId);

        for (Destination destination: destinationList) {
            PackageDetailsResponseDto.Destination dtoDestination = new PackageDetailsResponseDto.Destination();
            dtoDestination.setName(destination.getName());
            dtoDestination.setActivityList(activityService.getActivityDtoDetailsByDestinationId(destination.getId()));
            dtoDestinationList.add(dtoDestination);
        }

        return dtoDestinationList;
    }
}
