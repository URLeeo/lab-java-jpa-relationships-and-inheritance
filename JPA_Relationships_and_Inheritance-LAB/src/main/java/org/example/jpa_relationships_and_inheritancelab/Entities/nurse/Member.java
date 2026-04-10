package org.example.jpa_relationships_and_inheritancelab.Entities.nurse;

import jakarta.persistence.*;
import org.example.jpa_relationships_and_inheritancelab.Enums.MemberStatus;

import java.time.LocalDate;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private MemberStatus status;

    private LocalDate renewalDate;

    @ManyToOne
    @JoinColumn(name = "division_id")
    private Division division;

    public Member() {
    }

    public Member(String name, MemberStatus status, LocalDate renewalDate) {
        this.name = name;
        this.status = status;
        this.renewalDate = renewalDate;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public MemberStatus getStatus() {
        return status;
    }

    public LocalDate getRenewalDate() {
        return renewalDate;
    }

    public Division getDivision() {
        return division;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(MemberStatus status) {
        this.status = status;
    }

    public void setRenewalDate(LocalDate renewalDate) {
        this.renewalDate = renewalDate;
    }

    public void setDivision(Division division) {
        this.division = division;
    }
}