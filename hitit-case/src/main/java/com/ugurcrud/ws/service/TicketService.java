package com.ugurcrud.ws.service;


import com.ugurcrud.ws.entity.Ticket;

import java.util.List;

public interface TicketService {
    List<Ticket> getAll();
    Ticket findById(Integer id);
    Ticket save(Ticket ticket);
    String deleteById(Integer ticketId);
}
