package com.ugurcrud.ws;

import com.ugurcrud.ws.dto.PassengerDto;
import com.ugurcrud.ws.service.PassengerService;
import com.ugurcrud.ws.service.impl.PassengerServiceImpl;
import com.ugurcrud.ws.service.impl.TicketServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@SpringBootApplication
public class Application {
	private static PassengerServiceImpl passengerService;

	public Application(PassengerServiceImpl passengerService) {
		this.passengerService = passengerService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println(passengerService.getAll().toString());
	}

}
