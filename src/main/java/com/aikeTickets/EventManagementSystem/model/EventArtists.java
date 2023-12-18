package com.aikeTickets.EventManagementSystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="eventArtists")
public class EventArtists {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String artistName;

}
