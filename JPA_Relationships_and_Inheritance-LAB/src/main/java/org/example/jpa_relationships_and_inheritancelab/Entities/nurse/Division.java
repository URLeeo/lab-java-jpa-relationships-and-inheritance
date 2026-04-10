package org.example.jpa_relationships_and_inheritancelab.Entities.nurse;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String district;

    @ManyToOne
    @JoinColumn(name = "association_id")
    private Association association;

    @OneToOne
    @JoinColumn(name = "president_id")
    private Member president;

    @OneToMany(mappedBy = "division", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Member> members = new ArrayList<>();

    public Division() {
    }

    public Division(String name, String district) {
        this.name = name;
        this.district = district;
    }

    public void addMember(Member member) {
        members.add(member);
        member.setDivision(this);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDistrict() {
        return district;
    }

    public Association getAssociation() {
        return association;
    }

    public Member getPresident() {
        return president;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setAssociation(Association association) {
        this.association = association;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
