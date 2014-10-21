package main;
import java.util.Random;
import java.util.HashMap;

public class MultipleChoice implements Question {

	private char[] choices = {'a','b','c','d','e','f','g','h','i'};
	private HashMap<Integer, Character> record = new HashMap<Integer, Character>(); 
	private char answer;
	
	public MultipleChoice(){
		Random rand = new Random();
		answer = choices[rand.nextInt(choices.length)];
	}
	
	public void submitAnswer(Student s, int a) {
        
		record.put(s.getID(), choices[a]);
		
	}

	@Override
	public void pollAnswers() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
