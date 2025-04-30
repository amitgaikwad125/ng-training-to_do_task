package com.Enzigma.ToDoTask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Enzigma.ToDoTask.entity.TaskEntity;
import com.Enzigma.ToDoTask.repository.TaskRepo;

@Service
public class ServiceDao {

	@Autowired
	TaskRepo repo;
	
	public List<TaskEntity> getAllTasks() {

		
		return repo.findAll();
	}

	public TaskEntity create(TaskEntity task) {

		
		return repo.save(task);
	}

	public TaskEntity update(TaskEntity task) {
		
		return repo.save(task);
	}

	public String delete(int id) {
		
		 repo.deleteById(id);
		 return "task deleted";
	}

	
	
}
