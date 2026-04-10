package org.example.jpa_relationships_and_inheritancelab.Repositories.prRepositories;

import org.example.jpa_relationships_and_inheritancelab.Entities.pr.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}