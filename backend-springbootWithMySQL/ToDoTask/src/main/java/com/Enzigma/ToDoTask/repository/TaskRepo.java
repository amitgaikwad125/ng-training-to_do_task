package com.Enzigma.ToDoTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Enzigma.ToDoTask.entity.TaskEntity;

@Repository
public interface TaskRepo extends JpaRepository<TaskEntity, Integer> {

}
