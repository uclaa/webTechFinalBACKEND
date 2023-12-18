package com.aikeTickets.EventManagementSystem.repository;

import com.aikeTickets.EventManagementSystem.model.Tickets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Tickets, Integer> {
}
