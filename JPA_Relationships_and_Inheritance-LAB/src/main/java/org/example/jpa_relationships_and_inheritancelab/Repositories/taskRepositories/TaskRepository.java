package org.example.jpa_relationships_and_inheritancelab.Repositories.taskRepositories;

import org.example.jpa_relationships_and_inheritancelab.Entities.task.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}