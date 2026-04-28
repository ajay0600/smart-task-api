package com.example.demo.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.example.demo.models.Status;
import com.example.demo.models.Task;
import com.example.demo.store.TaskStore;
import com.example.demo.util.PriorityUtil;

@Service
public class TaskService {

	private final TaskStore store = new TaskStore();
	
	public Map<String, Object> createTask(Task task){
		String id = UUID.randomUUID().toString();
		task.setId(id);
		task.setStatus(Status.PENDING);
		
		Map<String, String> priority = PriorityUtil.suggestPriority(task);
		store.save(task);
		
		Map<String, Object> response = new HashMap<>();
        response.put("task", task);
        response.put("priority", priority);

        return response;
		
	}
	
	  public List<Task> getAllTasks() {
        return store.getAll();
     }
	
	  public Task updateTask(String id, String statusString) {
		  
		  Task task = store.getById(id);
	        if (task == null) return null;
	        
	        try {
	        	
	        	Status status = Status.valueOf(statusString.toUpperCase());
	        	task.setStatus(status);
	        	
	        }catch(Exception e){
	        	throw new RuntimeException("Invalid status. Use PENDING or COMPLETED");
	        }
		  return task;
	  }
	
}
