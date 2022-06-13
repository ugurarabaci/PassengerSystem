package com.ugurcrud.ws.controller;

import com.ugurcrud.ws.dto.PassengerDto;
import com.ugurcrud.ws.entity.Passenger;
import com.ugurcrud.ws.mapper.PassengerMapper;
import com.ugurcrud.ws.service.impl.PassengerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Validated
@RestController
@RequestMapping("/api/passenger")
public class PassengerController {


    private final PassengerServiceImpl passengerService;
    private static final PassengerMapper PASSENGER_MAPPER = Mappers.getMapper(PassengerMapper.class);
    public PassengerController(PassengerServiceImpl passengerService) {
        this.passengerService = passengerService;
    }

    @GetMapping(value = "/getAll")
    public ResponseEntity<List<PassengerDto>> getAllFlights(){
        return new ResponseEntity<>(passengerService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<PassengerDto> getPassengerId(@PathVariable("id") Integer id) {
        PassengerDto passengerById = PASSENGER_MAPPER.toDto(passengerService.getPassengerById(id));
        return new ResponseEntity<>(passengerById, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Passenger> addPassenger(@Valid @RequestBody PassengerDto passenger) {
        Passenger addPassenger = passengerService.addPassenger(PASSENGER_MAPPER.toEntity(passenger));
        return new ResponseEntity<>(addPassenger, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deletePassengerById(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(passengerService.deletePassengerById(id), HttpStatus.ACCEPTED);
    }

    @PutMapping(path = "/update")
    public Passenger update(@Valid @RequestBody Passenger passenger) {
        return passengerService.addPassenger(passenger);
    }


}
