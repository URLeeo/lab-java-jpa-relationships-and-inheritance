package org.example.jpa_relationships_and_inheritancelab.Repositories.eventRepositories;

import org.example.jpa_relationships_and_inheritancelab.Entities.event.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceRepository extends JpaRepository<Conference, Long> {
}