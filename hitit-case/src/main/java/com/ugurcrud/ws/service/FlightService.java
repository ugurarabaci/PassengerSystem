package com.ugurcrud.ws.service;


import com.ugurcrud.ws.entity.Flight;

import java.util.List;

public interface FlightService {
    List<Flight> getAll();
    Flight save(Flight flight);
    Flight findById(Integer flightId);
    String deleteById(Integer flightId);

}
