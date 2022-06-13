package com.ugurcrud.ws.controller;

import com.ugurcrud.ws.entity.Flight;
import com.ugurcrud.ws.service.impl.FlightServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Validated
@RestController
@RequestMapping("/api/flight")
public class FlightController {
    private final FlightServiceImpl flightService;

    public FlightController(FlightServiceImpl flightService) {
        this.flightService = flightService;
    }

    @GetMapping("list")
    public String viewHomePage(Model model) {
        model.addAttribute("flightList", flightService.getAll());
        return "index";
    }

    @GetMapping(value = "/getAll")
    public ResponseEntity<List<Flight>> getAllFlights() {
        return new ResponseEntity<>(flightService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Flight> getFlightById(@PathVariable("id") Integer id) {
        Flight flightById = flightService.getFlightById(id);
        return new ResponseEntity<>(flightById, HttpStatus.OK);
    }

    @PostMapping(path = "/save")
    public ResponseEntity<Object> addFlight(@Valid @RequestBody Flight flight) {
        return new ResponseEntity<>(flightService.addFlight(flight), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deletePassengerById(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(flightService.deleteFlightById(id), HttpStatus.ACCEPTED);
    }

    @PutMapping(path = "/update")
    public Flight update(@Valid @RequestBody Flight flight) {
        return flightService.addFlight(flight);
    }

}
