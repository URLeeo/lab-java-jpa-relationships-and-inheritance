package org.example.jpa_relationships_and_inheritancelab.Repositories.eventRepositories;

import org.example.jpa_relationships_and_inheritancelab.Enums.GuestStatus;
import org.example.jpa_relationships_and_inheritancelab.Entities.event.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface GuestRepository extends JpaRepository<Guest, Long> {
    List<Guest> findByStatus(GuestStatus status);
}