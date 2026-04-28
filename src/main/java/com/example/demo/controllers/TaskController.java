package com.example.demo.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Task;
import com.example.demo.services.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {

	@Autowired
	private  TaskService service;
	
	@PostMapping
	public Map<String, Object> createTask(@RequestBody Task task){
		return service.createTask(task);
	}
	
	@GetMapping
    public List<Task> getTasks() {
        return service.getAllTasks();
    }
	
	@PatchMapping("/{id}")
	public Task updateTask(@PathVariable String id, @RequestBody Map<String, String> body) {
		return service.updateTask(id, body.get("status"));
	}
	
}
