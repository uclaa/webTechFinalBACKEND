package com.aikeTickets.EventManagementSystem.repository;

import com.aikeTickets.EventManagementSystem.model.EventPricing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PricingRepository extends JpaRepository<EventPricing, Integer> {

    @Query("SELECT ep.categoryName, ep.price FROM EventPricing ep WHERE Event = :eventCode")
    List<EventPricing> findCategoryAndPriceByEventCode(String eventCode);
}
