package com.ugurcrud.ws.service;

import java.util.List;

import com.ugurcrud.ws.entity.Passenger;

public interface PassengerService {

	public List<Passenger> getAll();
	
	public Passenger findById(int id);
	
	public void save(Passenger passenger);
	
	public void deleteById(int id);
	
}
