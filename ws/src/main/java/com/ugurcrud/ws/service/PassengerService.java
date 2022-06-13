package com.ugurcrud.ws.service;

import com.ugurcrud.ws.dto.PassengerDto;
import com.ugurcrud.ws.entity.Passenger;

import java.util.List;

public interface PassengerService {
    List<PassengerDto> getAll();
    Passenger addPassenger(Passenger passenger);
    Passenger getPassengerById(Integer passengerId);
    String deletePassengerById(Integer passengerId);
}
