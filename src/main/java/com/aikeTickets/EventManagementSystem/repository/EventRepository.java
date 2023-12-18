package com.aikeTickets.EventManagementSystem.repository;

import com.aikeTickets.EventManagementSystem.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, String> {
}
