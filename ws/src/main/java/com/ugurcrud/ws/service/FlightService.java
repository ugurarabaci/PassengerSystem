package com.ugurcrud.ws.service;

import com.ugurcrud.ws.entity.Flight;

import java.util.List;

public interface FlightService {
    List<Flight> getAll();
    Flight addFlight(Flight flight);
    Flight getFlightById(Integer flightId);
    String deleteFlightById(Integer flightId);

}
