package org.example.jpa_relationships_and_inheritancelab.Entities.task;

import jakarta.persistence.Entity;
import java.time.LocalDate;

@Entity
public class InternalTask extends Task {

    public InternalTask() {
    }

    public InternalTask(String title, LocalDate dueDate, boolean completed) {
        super(title, dueDate, completed);
    }
}