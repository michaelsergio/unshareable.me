package me.unsharable.models;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Game {
	public static Map<String, List<String>> questionsMap;
	
	static {
		if (questionsMap == null) {
			// Generate Question Map
			questionsMap = new HashMap<String, List<String>>();
			
			List<String> colorQuestions = new LinkedList<String>();
			colorQuestions.add("The most blue object");
			
			questionsMap.put("Color Questions", colorQuestions);
		}
	}
	
	public static String getRandomQuestion() {
		// This methods really inefficent, fix later. -ms
		Set<String> keys = questionsMap.keySet();
		
		int size = keys.size();
		int item = new Random().nextInt(size); // In real life, the Random object should be rather more shared than this
		int i = 0;
		String str = null;
		for(String obj : keys)
		{
			if (i == item) {
				str = obj;
				break;
			}
			i = i + 1;
		}
		List<String> questions = questionsMap.get(str);
		return questions.get(new Random().nextInt(size));
		
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
	
	public static void askQuestion(String question) {
		
	}
}
