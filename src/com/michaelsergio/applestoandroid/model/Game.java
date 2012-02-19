package com.michaelsergio.applestoandroid.model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Game {
	public static Map<String, List<String>> questionsMap;
	
	public Game() {
		if (questionsMap == null) {
			// Generate Question Map
			questionsMap = new HashMap<String, List<String>>();
			
			List<String> colorQuestions = new LinkedList<String>();
			colorQuestions.add("The most blue object");
			
			questionsMap.put("Color Questions", colorQuestions);
		}
	}
	
	
	public List<Question> getAllQuestions() {
		return null;
	}
	
	public void askQuestion(String question) {
		
	}
}
