package com.example.demo.util;

import java.util.*;

import com.example.demo.models.Task;

public class PriorityUtil {

	public static Map<String, String> suggestPriority(Task task){
		
		String text = (task.getTitle() + " " + 
		Optional.ofNullable(task.getDescription()).orElse(" ")).toLowerCase();
		
		String priority = "medium";
		String reason = "Default assigned";
		
		if(text.contains("urgent") || 
				text.contains("critical") ||
	            text.contains("bug") ||
	            text.contains("error")) {
			priority = "high";
			reason = "High priority";
		}
		else if(text.contains("later") ||
                text.contains("optional") ||
                text.contains("nice to have")) {
			priority = "low";
			reason = "Low priority";
		}
		
		Map<String, String> result = new HashMap<>();
        result.put("priority", priority);
        result.put("reason", reason);
        
     
        return result;
	}
	
}
