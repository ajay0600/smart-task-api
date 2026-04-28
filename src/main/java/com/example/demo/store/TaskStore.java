package com.example.demo.store;

import java.util.*;

import com.example.demo.models.Task;

public class TaskStore {

	private final Map<String, Task> db = new HashMap<>();
	
	public void save(Task task) {
		db.put(task.getId(), task);
	}
	
	public List<Task> getAll(){
		return new ArrayList<>(db.values());
	}
	
	public Task getById(String id) {
        return db.get(id);
    }
	
	public Task update(String id, Task task) {
		db.put(id,  task);
		return task;
	}
	
}
