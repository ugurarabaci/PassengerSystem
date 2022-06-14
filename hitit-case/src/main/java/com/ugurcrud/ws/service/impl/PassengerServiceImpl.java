package com.ugurcrud.ws.service.impl;

import java.util.List;

import com.ugurcrud.ws.entity.Passenger;
import com.ugurcrud.ws.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ugurcrud.ws.repository.PassengerRepository;

@Service
public class PassengerServiceImpl implements PassengerService {

	private PassengerRepository passengerRepository;
	
	@Autowired
	public PassengerServiceImpl(PassengerRepository thePassengerRepository) {
		passengerRepository = thePassengerRepository;
	}
	
	@Override
	public List<Passenger> getAll() {
		return passengerRepository.findAll();
	}

	@Override
	public Passenger findById(int id) {
		return passengerRepository.findById(id).get();
	}

	@Override
	public void save(Passenger passenger) {
		passengerRepository.save(passenger);
	}

	@Override
	public void deleteById(int id) {
		passengerRepository.deleteById(id);
	}

}






