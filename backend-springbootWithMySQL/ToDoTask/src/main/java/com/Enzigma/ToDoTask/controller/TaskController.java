package com.Enzigma.ToDoTask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Enzigma.ToDoTask.entity.TaskEntity;


@RestController
@CrossOrigin(origins = "http://localhost:5173/")
@RequestMapping("todo")
public class TaskController {

	@Autowired
	ServiceDao service;
	
	@GetMapping("getAll")
	public List<TaskEntity> getAllTasks(){
		
		return service.getAllTasks();
	}
	
	
	@PostMapping("create")
	public TaskEntity addNewTask(@RequestBody TaskEntity task) {
		System.out.println(task);
		return service.create(task);
	}

	@PutMapping("update/{id}")
	public TaskEntity updateTask(@RequestBody TaskEntity task) {
		
		return service.update(task);
	}

	@DeleteMapping("delete/{id}")
	public String deleteTask(@PathVariable int id) {
		
		return service.delete(id);
	}
}
