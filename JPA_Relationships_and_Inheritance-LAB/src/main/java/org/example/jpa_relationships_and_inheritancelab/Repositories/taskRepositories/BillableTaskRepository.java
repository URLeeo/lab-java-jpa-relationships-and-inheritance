package org.example.jpa_relationships_and_inheritancelab.Repositories.taskRepositories;

import org.example.jpa_relationships_and_inheritancelab.Entities.task.BillableTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillableTaskRepository extends JpaRepository<BillableTask, Long> {
}