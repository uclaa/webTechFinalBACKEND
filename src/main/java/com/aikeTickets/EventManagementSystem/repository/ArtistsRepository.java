package com.aikeTickets.EventManagementSystem.repository;

import com.aikeTickets.EventManagementSystem.model.EventArtists;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistsRepository extends JpaRepository<EventArtists, Integer> {
}
