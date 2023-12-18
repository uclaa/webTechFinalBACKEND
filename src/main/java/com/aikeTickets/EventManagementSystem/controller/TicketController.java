package com.aikeTickets.EventManagementSystem.controller;

import com.aikeTickets.EventManagementSystem.exception.ResourceNotFoundException;
import com.aikeTickets.EventManagementSystem.model.Event;
import com.aikeTickets.EventManagementSystem.model.Tickets;
import com.aikeTickets.EventManagementSystem.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketRepository ticketRepository;

    @PostMapping
    public Tickets createTicket(@RequestBody Tickets ticket){
        return ticketRepository.save(ticket);
    }

    @GetMapping
    public List<Tickets> getAllTickets(){
        return ticketRepository.findAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<Tickets> getTicketById(@PathVariable int id){
        Tickets ticket = ticketRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Event Doesn't Exist"));
        return ResponseEntity.ok(ticket);
    }


}
