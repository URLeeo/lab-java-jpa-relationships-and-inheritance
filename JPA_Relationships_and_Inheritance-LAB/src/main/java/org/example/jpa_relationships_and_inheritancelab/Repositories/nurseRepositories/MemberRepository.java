package org.example.jpa_relationships_and_inheritancelab.Repositories.nurseRepositories;
import org.example.jpa_relationships_and_inheritancelab.Entities.nurse.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}