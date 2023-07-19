package com.example.Wanderlust.controllers;

import com.example.Wanderlust.dtos.PassengerDetailsResponseDto;
import com.example.Wanderlust.models.Passenger;
import com.example.Wanderlust.models.enums.Membership;
import com.example.Wanderlust.services.ActivityService;
import com.example.Wanderlust.services.PassengerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/passengers")
public class PassengerController {
    PassengerService passengerService = new PassengerService();
    ActivityService activityService = new ActivityService();


    @GetMapping("/{passengerId}")
    public PassengerDetailsResponseDto getPackageDetails(@PathVariable Long passengerId) {
        PassengerDetailsResponseDto passengerDetailsResponseDto = new PassengerDetailsResponseDto();
        Passenger passenger = passengerService.getPassengerById(passengerId);

        if (passenger != null) {
            passengerDetailsResponseDto.setName(passenger.getName());
            passengerDetailsResponseDto.setNumber(passenger.getNumber());
            if (passenger.getMembership() == Membership.PREMIUM) {
                passengerDetailsResponseDto.setBalance("INFINITE");
            } else {
                passengerDetailsResponseDto.setBalance(passenger.getBalance().toString());
            }
            passengerDetailsResponseDto.setSignedUpActivityList(activityService.getActivityDtoDetailsByPassengerId(passengerId));
        }

        return passengerDetailsResponseDto;
    }
}
