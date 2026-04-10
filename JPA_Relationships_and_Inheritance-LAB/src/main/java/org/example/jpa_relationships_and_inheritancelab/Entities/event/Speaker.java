package org.example.jpa_relationships_and_inheritancelab.Entities.event;

import jakarta.persistence.*;

@Entity
public class Speaker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer presentationDuration;

    @ManyToOne
    @JoinColumn(name = "conference_id")
    private Conference conference;

    public Speaker() {
    }

    public Speaker(String name, Integer presentationDuration) {
        this.name = name;
        this.presentationDuration = presentationDuration;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPresentationDuration() {
        return presentationDuration;
    }

    public Conference getConference() {
        return conference;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPresentationDuration(Integer presentationDuration) {
        this.presentationDuration = presentationDuration;
    }

    public void setConference(Conference conference) {
        this.conference = conference;
    }
}
