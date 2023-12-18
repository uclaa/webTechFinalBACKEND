package com.aikeTickets.EventManagementSystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="events")
public class Event {
    @Id
    private String eventCode;
    private String eventName;
    private String eventPlace;
    private String eventDate;
    private String eventTime;
    private String eventDescription;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_eventCode", referencedColumnName = "eventCode")
    private List<EventArtists> eventArtists;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_eventCode", referencedColumnName = "eventCode")
    private List<EventPricing> eventPricing;


}
