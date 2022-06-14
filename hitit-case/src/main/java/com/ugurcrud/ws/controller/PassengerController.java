package com.ugurcrud.ws.controller;

import java.util.List;

import com.ugurcrud.ws.entity.Passenger;
import com.ugurcrud.ws.mapper.PassengerMapper;
import com.ugurcrud.ws.service.PassengerService;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@RequiredArgsConstructor
@Controller
@RequestMapping("/api/passenger")
public class PassengerController {

    private PassengerService passengerService;

    @Autowired
    public PassengerController(PassengerService passengerService) {
        this.passengerService = passengerService;
    }
    // add mapping for "/list"
    @GetMapping("/list")
    public String passengerList(Model model) {
        // get passengers from data base
        List<Passenger> passengers = passengerService.getAll();
        // add to the spring model
        model.addAttribute("passengers", passengers);
        return "passengers/list-passengers";
    }
    // add mapping for "/add" to add new passengers
    @GetMapping("/add")
    public String addPassenger(Model model) {
        // create model attribute to bind form data
        Passenger passenger = new Passenger();
        model.addAttribute("passenger", passenger);
        return "passengers/passenger-form";
    }
    @GetMapping("/update")
    public String updatePassenger(@RequestParam("passengerId") int id, Model model) {
        // get the passenger from the service
        Passenger passenger = passengerService.findById(id);
        // set passenger as a model attribute to pre-populate the form
        model.addAttribute("passenger", passenger);
        // send over to our form
        return "passengers/passenger-form";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("passengerId") int id) {
        // delete passenger
        passengerService.deleteById(id);
        // return to list
        return "redirect:list";
    }
    @PostMapping("/save")
    public String savePassenger(@ModelAttribute("passenger") Passenger passenger) {
        // save the passenger
        passengerService.save(passenger);
        // use a redirect to prevent duplicated submissions
        return "redirect:list";
    }
}
