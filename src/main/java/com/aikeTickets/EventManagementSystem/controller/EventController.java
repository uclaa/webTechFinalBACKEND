package com.aikeTickets.EventManagementSystem.controller;

import com.aikeTickets.EventManagementSystem.exception.ResourceNotFoundException;
import com.aikeTickets.EventManagementSystem.model.Event;
import com.aikeTickets.EventManagementSystem.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/event")
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @PostMapping
    public Event createEvent(@RequestBody Event event){
        return eventRepository.save(event);
    }

    @GetMapping
    public List<Event> getEvents(){
        return eventRepository.findAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<Event> getEventById(@PathVariable String id){
        Event event = eventRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
        return ResponseEntity.ok(event);

    }

    @PutMapping("{id}")
    public ResponseEntity<Event> updateEvent(@PathVariable String id, @RequestBody Event eventDetails){
        Event updateEvent= eventRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));

        updateEvent.setEventName(eventDetails.getEventName());
        updateEvent.setEventPlace(eventDetails.getEventPlace());
        updateEvent.setEventDescription(eventDetails.getEventDescription());
        updateEvent.setEventDate(eventDetails.getEventDate());
        updateEvent.setEventTime(eventDetails.getEventTime());


        eventRepository.save(updateEvent);
        return ResponseEntity.ok(updateEvent);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteStudent(@PathVariable String id){
        Event event = eventRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
        eventRepository.delete(event);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
