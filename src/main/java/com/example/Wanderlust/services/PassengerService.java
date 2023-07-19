package com.example.Wanderlust.services;

import com.example.Wanderlust.dtos.PassengersListResponseDto;
import com.example.Wanderlust.models.Passenger;
import com.example.Wanderlust.repositories.PassengerRepository;

import java.util.ArrayList;
import java.util.List;


public class PassengerService {
    PassengerRepository passengerRepository = new PassengerRepository();


    public Passenger getPassengerById(long passengerId) {
        return passengerRepository.getPassengerById(passengerId);
    }


    public List<PassengersListResponseDto.Passenger> getPassengersDtoDetailsByPackageId(long packageId) {
        List<PassengersListResponseDto.Passenger> dtoPassengerList = new ArrayList<>();
        List<Passenger> passengerList = passengerRepository.getPassengersByPackageId(packageId);

        for (Passenger passenger: passengerList) {
            PassengersListResponseDto.Passenger dtoPassenger = new PassengersListResponseDto.Passenger();
            dtoPassenger.setName(passenger.getName());
            dtoPassenger.setNumber(passenger.getNumber());
            dtoPassengerList.add(dtoPassenger);
        }

        return dtoPassengerList;
    }
}
