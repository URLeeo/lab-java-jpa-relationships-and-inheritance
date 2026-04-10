package org.example.jpa_relationships_and_inheritancelab.Repositories.nurseRepositories;

import org.example.jpa_relationships_and_inheritancelab.Entities.nurse.Division;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DivisionRepository extends JpaRepository<Division, Long> {
    List<Division> findByDistrict(String district);
}
