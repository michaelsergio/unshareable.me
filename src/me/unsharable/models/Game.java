package me.unsharable.models;

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
	
	
	public static List<Question> getAllQuestions() {
		Question q = new Question();
		q.questionAsked = "hi";
		q.questionId = -27;
		Question q1 = new Question();
		q1.questionAsked = "bye";
		q1.questionId = -28;
		LinkedList<Question> ll = new LinkedList<Question>();
		ll.add(q);
		return ll;
	}
	
	public void askQuestion(String question) {
		
	}
}
