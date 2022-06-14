package com.ugurcrud.ws.service.impl;


import com.ugurcrud.ws.entity.Flight;
import com.ugurcrud.ws.repository.FlightRepository;
import com.ugurcrud.ws.service.FlightService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FlightServiceImpl implements FlightService {

    private final FlightRepository flightRepository;
    public FlightServiceImpl(FlightRepository flightRepository)
    {
        this.flightRepository = flightRepository;
    }
    @Override
    public List<Flight> getAll() {
        return flightRepository.findAll();
    }

    @Override
    public Flight findById(Integer id) {
        return flightRepository.findById(id).get();
    }

    @Override
    public Flight save(Flight flight) {
        return flightRepository.save(flight);
    }

    @Override
    public String deleteById(Integer id)
    {
        flightRepository.deleteById(id);
        return "Deleted";
    }

}
