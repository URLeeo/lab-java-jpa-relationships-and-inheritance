package org.example.jpa_relationships_and_inheritancelab.Entities.event;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Conference extends Event {

    @OneToMany(mappedBy = "conference", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Speaker> speakers = new ArrayList<>();

    public Conference() {
    }

    public Conference(String title, LocalDate date, Integer duration, String location) {
        super(title, date, duration, location);
    }

    public void addSpeaker(Speaker speaker) {
        speakers.add(speaker);
        speaker.setConference(this);
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }
}