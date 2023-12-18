package com.aikeTickets.EventManagementSystem.controller;

import com.aikeTickets.EventManagementSystem.model.Event;
import com.aikeTickets.EventManagementSystem.model.EventPricing;
import com.aikeTickets.EventManagementSystem.repository.PricingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PrivateKey;
import java.util.List;

@RestController
@RequestMapping("/pricing")
public class PricingController {

    @Autowired
    private PricingRepository eventPricingService;

    @GetMapping("{id}")
    public List<EventPricing> getEvents(@PathVariable Event id) {
        return eventPricingService.findCategoryAndPriceByEventCode(String.valueOf(id));
    }
}
