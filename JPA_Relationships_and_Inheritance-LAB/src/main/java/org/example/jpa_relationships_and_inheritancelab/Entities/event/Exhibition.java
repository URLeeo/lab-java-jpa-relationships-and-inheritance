package org.example.jpa_relationships_and_inheritancelab.Entities.event;

import jakarta.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Exhibition extends Event {

    public Exhibition() {
    }

    public Exhibition(String title, LocalDate date, Integer duration, String location) {
        super(title, date, duration, location);
    }
}