package org.example.jpa_relationships_and_inheritancelab.Repositories.eventRepositories;

import org.example.jpa_relationships_and_inheritancelab.Entities.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long>{

}
