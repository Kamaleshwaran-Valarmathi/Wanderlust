package com.example.Wanderlust.controllers;

import com.example.Wanderlust.dtos.AvailableActivitiesResponseDto;
import com.example.Wanderlust.services.ActivityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/activities")
public class ActivityController {
    ActivityService activityService = new ActivityService();


    @GetMapping("/available")
    public AvailableActivitiesResponseDto getAvailableActivities() {
        AvailableActivitiesResponseDto availableActivitiesResponseDto = new AvailableActivitiesResponseDto();
        availableActivitiesResponseDto.setAvailableAcitiviyList(activityService.getAvailableActivityDtoDetails());
        return availableActivitiesResponseDto;
    }
}
