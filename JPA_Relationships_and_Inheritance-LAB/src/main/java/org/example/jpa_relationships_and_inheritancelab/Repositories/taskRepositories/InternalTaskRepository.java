package org.example.jpa_relationships_and_inheritancelab.Repositories.taskRepositories;

import org.example.jpa_relationships_and_inheritancelab.Entities.task.InternalTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternalTaskRepository extends JpaRepository<InternalTask, Long> {
}
