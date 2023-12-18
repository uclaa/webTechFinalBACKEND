package com.aikeTickets.EventManagementSystem.controller;

import com.aikeTickets.EventManagementSystem.model.Event;
import com.aikeTickets.EventManagementSystem.model.EventArtists;
import com.aikeTickets.EventManagementSystem.repository.ArtistsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("artists")
public class ArtistController
{

    @Autowired
    private ArtistsRepository artistsRepository;

    @GetMapping
    public List<EventArtists> getEvents(){
        return artistsRepository.findAll();
    }
}
