package com.ugurcrud.ws.controller;

import com.ugurcrud.ws.entity.Flight;
import com.ugurcrud.ws.service.impl.FlightServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Validated
@RestController
@RequestMapping("/api/flight")
public class FlightController {
    private final FlightServiceImpl flightService;
    public FlightController(FlightServiceImpl flightService) {
        this.flightService = flightService;
    }
    @GetMapping(value = "/getAll")
    public ResponseEntity<List<Flight>> getAllFlights() {
        return new ResponseEntity<>(flightService.getAll(), HttpStatus.OK);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Flight> getFlightById(@PathVariable("id") Integer id) {
        Flight flightById = flightService.findById(id);
        return new ResponseEntity<>(flightById, HttpStatus.OK);
    }

    @PostMapping(path = "/save")
    public ResponseEntity<Object> addFlight(@Valid @RequestBody Flight flight) {
        return new ResponseEntity<>(flightService.save(flight), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deletePassengerById(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(flightService.deleteById(id), HttpStatus.ACCEPTED);
    }

    @PutMapping(path = "/update")
    public Flight update(@Valid @RequestBody Flight flight) {
        return flightService.save(flight);
    }

}
