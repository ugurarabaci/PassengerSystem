package com.ugurcrud.ws.service.impl;

import com.ugurcrud.ws.dto.PassengerDto;
import com.ugurcrud.ws.entity.Flight;
import com.ugurcrud.ws.entity.Passenger;
import com.ugurcrud.ws.repository.PassengerRepository;
import com.ugurcrud.ws.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PassengerServiceImpl implements PassengerService {


    private PassengerRepository passengerRepository;
    public PassengerServiceImpl(PassengerRepository passengerRepository)
    {
        this.passengerRepository = passengerRepository;
    }

    @Override
    public List<PassengerDto> getAll() {
        List<Passenger> passengers = passengerRepository.findAll();
        List<PassengerDto> passengerDtos= new ArrayList<>();
        passengers.forEach(it -> {
            PassengerDto passengerDto =new PassengerDto();
            passengerDto.setId(it.getId());
            passengerDto.setAge(it.getAge());
            passengerDto.setEmail(it.getEmail());
            passengerDto.setFirstname(it.getFirstname());
            passengerDto.setLastname(it.getLastname());
            passengerDto.setPhone(it.getPhone());

            passengerDtos.add(passengerDto);
        });
        return passengerDtos;
    }

    @Override
    public Passenger addPassenger(Passenger passenger) {
        return passengerRepository.save(passenger);
    }

    @Override
    public Passenger getPassengerById(Integer id) {
        return passengerRepository.findById(id).get();
    }

    @Override
    public String deletePassengerById(Integer passengerId) {
        passengerRepository.deleteById(passengerId);
        return "Deleted";
    }
}
