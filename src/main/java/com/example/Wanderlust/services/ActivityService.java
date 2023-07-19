package com.example.Wanderlust.services;

import com.example.Wanderlust.db.mapping_classes.PassengerActivity;
import com.example.Wanderlust.dtos.AvailableActivitiesResponseDto;
import com.example.Wanderlust.dtos.PackageDetailsResponseDto;
import com.example.Wanderlust.dtos.PassengerDetailsResponseDto;
import com.example.Wanderlust.models.*;
import com.example.Wanderlust.models.Package;
import com.example.Wanderlust.repositories.ActivityRepository;
import com.example.Wanderlust.repositories.DestinationRepository;
import com.example.Wanderlust.repositories.PackageRepository;
import com.example.Wanderlust.repositories.PassengerRepository;

import java.util.*;


public class ActivityService {
    ActivityRepository activityRepository = new ActivityRepository();
    DestinationRepository destinationRepository = new DestinationRepository();
    PackageRepository packageRepository = new PackageRepository();
    PassengerRepository passengerRepository = new PassengerRepository();


    public List<PackageDetailsResponseDto.Destination.Activity> getActivityDtoDetailsByDestinationId(Long destinationId) {
        List<PackageDetailsResponseDto.Destination.Activity> dtoActivityList = new ArrayList<>();
        List<Activity> activityList = activityRepository.getActivitiesByDestinationId(destinationId);

        for (Activity activity: activityList) {
            PackageDetailsResponseDto.Destination.Activity dtoActivity = new PackageDetailsResponseDto.Destination.Activity();
            dtoActivity.setName(activity.getName());
            dtoActivity.setDescription(activity.getDescription());
            dtoActivity.setCost(activity.getCost());
            dtoActivity.setCapacity(activity.getCapacity());
            dtoActivityList.add(dtoActivity);
        }

        return dtoActivityList;
    }


    public List<PassengerDetailsResponseDto.Activity> getActivityDtoDetailsByPassengerId(Long passengerId) {
        List<PassengerDetailsResponseDto.Activity> dtoActivityList = new ArrayList<>();
        Passenger curPassenger = passengerRepository.getPassengerById(passengerId);
        List<PassengerActivity> passengerActivityList = passengerRepository.getPassengerActivityListByPassengerId(passengerId);

        for (PassengerActivity passengerActivity: passengerActivityList) {
            PassengerDetailsResponseDto.Activity dtoActivity = new PassengerDetailsResponseDto.Activity();
            Activity curActivity = activityRepository.getActivityById(passengerActivity.getActivityId());
            if (curActivity != null) {
                dtoActivity.setName(curActivity.getName());
                dtoActivity.setDescription(curActivity.getDescription());
                if (curPassenger != null) {
                    dtoActivity.setPricePaid(curPassenger.calculateDiscountedPrice(curActivity.getCost()));
                }
            }

            Destination curDestination = destinationRepository.getDestinationById(passengerActivity.getDestinationId());
            if (curDestination != null) {
                dtoActivity.setDestinationName(curDestination.getName());
            }

            Package curPackage = packageRepository.getPackageById(passengerActivity.getPackageId());
            if (curPackage != null) {
                dtoActivity.setPackageName(curPackage.getName());
            }

            dtoActivityList.add(dtoActivity);
        }

        return dtoActivityList;
    }


    private Map<Long, Map<Long, Map<Long, Integer>>> groupPassengerActivity(HashSet<PassengerActivity> passengerActivityTable) {
        // { PackageId, { DestinationId, { ActivityId, Count } } }
        Map<Long, Map<Long, Map<Long, Integer>>> threeDMap = new HashMap<>();
        for (PassengerActivity passengerActivity: passengerActivityTable) {
            Long packageId = passengerActivity.getPackageId();
            Long destinationId = passengerActivity.getDestinationId();
            Long activityId = passengerActivity.getActivityId();

            if (!threeDMap.containsKey(packageId)) {
                threeDMap.put(packageId, new HashMap<>());
            }

            Map<Long, Map<Long, Integer>> secondLevelMap = threeDMap.get(packageId);
            if (!secondLevelMap.containsKey(destinationId)) {
                secondLevelMap.put(destinationId, new HashMap<>());
            }

            Map<Long, Integer> thirdLevelMap = secondLevelMap.get(destinationId);
            thirdLevelMap.put(activityId, thirdLevelMap.getOrDefault(activityId, 0) + 1);
        }
        return threeDMap;
    }


    public List<AvailableActivitiesResponseDto.Activity> getAvailableActivityDtoDetails() {
        List<AvailableActivitiesResponseDto.Activity> dtoAvailableActivityList = new ArrayList<>();

        // { PackageId, { DestinationId, { ActivityId, Count } } }
        Map<Long, Map<Long, Map<Long, Integer>>> passengerActivityFreq = groupPassengerActivity(activityRepository.getAllPassengerActivity());
        for (Map.Entry<Long, Map<Long, Map<Long, Integer>>> packageMap: passengerActivityFreq.entrySet()) {
            Package curPackage = packageRepository.getPackageById(packageMap.getKey());

            for (Map.Entry<Long, Map<Long, Integer>> destinationMap: packageMap.getValue().entrySet()) {
                Destination curDestination = destinationRepository.getDestinationById(destinationMap.getKey());

                for (Map.Entry<Long, Integer> activityMap: destinationMap.getValue().entrySet()) {
                    Activity curActivity = activityRepository.getActivityById(activityMap.getKey());

                    if (activityMap.getValue() < curActivity.getCapacity()) {
                        AvailableActivitiesResponseDto.Activity dtoAvailableActivity = new AvailableActivitiesResponseDto.Activity();
                        dtoAvailableActivity.setName(curActivity.getName());
                        dtoAvailableActivity.setDescription(curActivity.getDescription());
                        dtoAvailableActivity.setCost(curActivity.getCost());
                        dtoAvailableActivity.setTotalCapacity(curActivity.getCapacity());
                        dtoAvailableActivity.setAvailableCapacity(curActivity.getCapacity() - activityMap.getValue());
                        dtoAvailableActivity.setDestinationName(curDestination.getName());
                        dtoAvailableActivity.setPackageName(curPackage.getName());

                        dtoAvailableActivityList.add(dtoAvailableActivity);
                    }
                }
            }
        }

        return dtoAvailableActivityList;
    }
}
