package org.example.jpa_relationships_and_inheritancelab.Repositories.eventRepositories;

import org.example.jpa_relationships_and_inheritancelab.Entities.event.Exhibition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExhibitionRepository extends JpaRepository<Exhibition, Long> {
}