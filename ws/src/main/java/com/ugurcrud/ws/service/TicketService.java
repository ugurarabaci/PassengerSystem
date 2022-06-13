package com.ugurcrud.ws.service;

import com.ugurcrud.ws.entity.Ticket;

import java.util.List;

public interface TicketService {
    List<Ticket> getAllTickets();
    Ticket getTicketById(Integer id);
    Ticket addTicket(Ticket ticket);
    String deleteTicketById(Integer ticketId);
}
