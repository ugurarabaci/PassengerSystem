package com.ugurcrud.ws.dto;


public class FlightDto {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    private Integer id;
    private String departure;

    public FlightDto(Integer id, String departure, String arrival) {
        this.id = id;
        this.departure = departure;
        this.arrival = arrival;
    }

    private String arrival;
}
