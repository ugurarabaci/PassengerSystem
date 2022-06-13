package com.ugurcrud.ws.service.impl;

import com.ugurcrud.ws.entity.Flight;
import com.ugurcrud.ws.repository.FlightRepository;
import com.ugurcrud.ws.service.FlightService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Flight getFlightById(Integer id) {
        return flightRepository.findById(id).get();
    }

    @Override
    public Flight addFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    @Override
    public String deleteFlightById(Integer id)
    {
        flightRepository.deleteById(id);
        return "Deleted";
    }

}
