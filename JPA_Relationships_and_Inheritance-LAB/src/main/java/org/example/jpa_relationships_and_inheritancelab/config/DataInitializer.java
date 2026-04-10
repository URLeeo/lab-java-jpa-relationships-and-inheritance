package org.example.jpa_relationships_and_inheritancelab.config;

import org.example.jpa_relationships_and_inheritancelab.Entities.event.Conference;
import org.example.jpa_relationships_and_inheritancelab.Entities.event.Exhibition;
import org.example.jpa_relationships_and_inheritancelab.Entities.event.Guest;
import org.example.jpa_relationships_and_inheritancelab.Entities.event.Speaker;
import org.example.jpa_relationships_and_inheritancelab.Entities.nurse.Association;
import org.example.jpa_relationships_and_inheritancelab.Entities.nurse.Division;
import org.example.jpa_relationships_and_inheritancelab.Entities.nurse.Member;
import org.example.jpa_relationships_and_inheritancelab.Entities.pr.Contact;
import org.example.jpa_relationships_and_inheritancelab.Entities.pr.Name;
import org.example.jpa_relationships_and_inheritancelab.Entities.task.BillableTask;
import org.example.jpa_relationships_and_inheritancelab.Entities.task.InternalTask;
import org.example.jpa_relationships_and_inheritancelab.Enums.GuestStatus;
import org.example.jpa_relationships_and_inheritancelab.Enums.MemberStatus;
import org.example.jpa_relationships_and_inheritancelab.Repositories.eventRepositories.EventRepository;
import org.example.jpa_relationships_and_inheritancelab.Repositories.nurseRepositories.AssociationRepository;
import org.example.jpa_relationships_and_inheritancelab.Repositories.prRepositories.ContactRepository;
import org.example.jpa_relationships_and_inheritancelab.Repositories.taskRepositories.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.time.LocalDate;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner loadData(ContactRepository contactRepository,
                               AssociationRepository associationRepository,
                               EventRepository eventRepository,
                               TaskRepository taskRepository) {
        return args -> {

            contactRepository.save(new Contact("BBC", "Manager",
                    new Name("Mr.", "John", "A", "Smith")));
            contactRepository.save(new Contact("CNN", "Director",
                    new Name("Mrs.", "Anna", "B", "Taylor")));
            contactRepository.save(new Contact("Forbes", "Editor",
                    new Name("Dr.", "David", "C", "Brown")));

            Association association = new Association("Nurse Association of Spain");

            for (int i = 1; i <= 7; i++) {
                Division division = new Division("Division " + i, "District " + i);
                Member member = new Member("Member " + i, MemberStatus.ACTIVE, LocalDate.now().plusMonths(i));
                division.addMember(member);
                division.setPresident(member);
                association.addDivision(division);
            }

            associationRepository.save(association);

            Conference conference = new Conference("Tech Conference", LocalDate.now().plusDays(10), 3, "Madrid");
            conference.addGuest(new Guest("Alice", GuestStatus.ATTENDING));
            conference.addGuest(new Guest("Bob", GuestStatus.NO_RESPONSE));
            conference.addSpeaker(new Speaker("Dr. Green", 45));
            conference.addSpeaker(new Speaker("Prof. White", 60));

            Exhibition exhibition = new Exhibition("Art Expo", LocalDate.now().plusDays(20), 5, "Barcelona");
            exhibition.addGuest(new Guest("Charlie", GuestStatus.ATTENDING));
            exhibition.addGuest(new Guest("Diana", GuestStatus.NOT_ATTENDING));

            eventRepository.save(conference);
            eventRepository.save(exhibition);

            taskRepository.save(new BillableTask("Client Presentation", LocalDate.now().plusDays(2), false, new BigDecimal("75.00")));
            taskRepository.save(new BillableTask("Consulting Session", LocalDate.now().plusDays(4), false, new BigDecimal("100.00")));
            taskRepository.save(new InternalTask("Team Meeting", LocalDate.now().plusDays(1), false));
        };
    }
}