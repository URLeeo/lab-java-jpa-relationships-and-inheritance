package org.example.jpa_relationships_and_inheritancelab.Repositories.nurseRepositories;

import org.example.jpa_relationships_and_inheritancelab.Entities.nurse.Association;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssociationRepository extends JpaRepository<Association, Long> {
}
