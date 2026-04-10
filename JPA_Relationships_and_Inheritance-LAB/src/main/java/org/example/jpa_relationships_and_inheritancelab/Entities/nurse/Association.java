package org.example.jpa_relationships_and_inheritancelab.Entities.nurse;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Association {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "association", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Division> divisions = new ArrayList<>();

    public Association() {
    }

    public Association(String name) {
        this.name = name;
    }

    public void addDivision(Division division) {
        divisions.add(division);
        division.setAssociation(this);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Division> getDivisions() {
        return divisions;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDivisions(List<Division> divisions) {
        this.divisions = divisions;
    }
}