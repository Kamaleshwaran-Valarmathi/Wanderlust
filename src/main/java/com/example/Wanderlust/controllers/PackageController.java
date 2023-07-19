package com.example.Wanderlust.controllers;

import com.example.Wanderlust.dtos.PackageDetailsResponseDto;
import com.example.Wanderlust.dtos.PassengersListResponseDto;
import com.example.Wanderlust.models.Package;
import com.example.Wanderlust.services.DestinationService;
import com.example.Wanderlust.services.PackageService;
import com.example.Wanderlust.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/packages")
public class PackageController {
    DestinationService destinationService = new DestinationService();
    PackageService packageService = new PackageService();
    PassengerService passengerService = new PassengerService();


    @GetMapping("/{packageId}")
    public PackageDetailsResponseDto getPackageDetails(@PathVariable Long packageId) {
        PackageDetailsResponseDto packageDetailsResponseDto = new PackageDetailsResponseDto();
        Package curPackage = packageService.getPackageById(packageId);
        if (curPackage != null) {
            packageDetailsResponseDto.setPackageName(curPackage.getName());
        }
        packageDetailsResponseDto.setDestinationList(destinationService.getDestinationDtoDetailsByPackageId(packageId));
        return packageDetailsResponseDto;
    }


    @GetMapping("/{packageId}/passengers")
    public PassengersListResponseDto getPassengersList(@PathVariable long packageId) {
        List<PassengersListResponseDto.Passenger> passengerDtoList = passengerService.getPassengersDtoDetailsByPackageId(packageId);
        Package curPackage = packageService.getPackageById(packageId);

        PassengersListResponseDto passengersListResponseDto = new PassengersListResponseDto();
        if (curPackage != null) {
            passengersListResponseDto.setPackageName(curPackage.getName());
            passengersListResponseDto.setPassengerCapacity(curPackage.getCapacity());
            passengersListResponseDto.setEnrolledPassengersCount(passengerDtoList.size());
            passengersListResponseDto.setPassengerList(passengerDtoList);
        }

        return passengersListResponseDto;
    }
}
