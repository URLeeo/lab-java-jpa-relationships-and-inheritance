package org.example.jpa_relationships_and_inheritancelab.Repositories.eventRepositories;

import org.example.jpa_relationships_and_inheritancelab.Entities.event.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}