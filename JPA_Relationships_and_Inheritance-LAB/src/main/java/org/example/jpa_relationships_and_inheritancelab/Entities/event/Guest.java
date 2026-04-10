package org.example.jpa_relationships_and_inheritancelab.Entities.event;

import jakarta.persistence.*;
import org.example.jpa_relationships_and_inheritancelab.Enums.GuestStatus;

@Entity
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private GuestStatus status;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    public Guest() {
    }

    public Guest(String name, GuestStatus status) {
        this.name = name;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public GuestStatus getStatus() {
        return status;
    }

    public Event getEvent() {
        return event;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(GuestStatus status) {
        this.status = status;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}