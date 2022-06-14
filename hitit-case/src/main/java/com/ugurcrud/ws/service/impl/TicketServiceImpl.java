package com.ugurcrud.ws.service.impl;

import com.ugurcrud.ws.entity.Ticket;
import com.ugurcrud.ws.repository.TicketRepository;
import com.ugurcrud.ws.service.TicketService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {


    private TicketRepository ticketRepository;

    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public Ticket findById(Integer id) {
        return ticketRepository.findById(id).get();
    }

    @Override
    public Ticket save(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public String deleteById(Integer ticketId) {
        ticketRepository.deleteById(ticketId);
        return "Deleted";
    }

    @Override
    public List<Ticket> getAll() {
        return ticketRepository.findAll();
    }

}
