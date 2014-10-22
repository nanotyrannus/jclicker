package main;
import java.util.HashMap;
import java.util.Random;

public class TrueFalse implements Question {
	private char[] choices = {'f','t'};
	private char answer;
    HashMap<Integer, Character> record = new HashMap<Integer, Character>();
	
    public TrueFalse(){
    	Random rand = new Random();
		answer = choices[rand.nextInt(choices.length)];
    }
    
	@Override
	public void submitAnswer(int s, int a) {
		record.put(s, choices[a]);
		
	}
	
	public char[] getChoices(){
		return choices;
	}
	
	public char getAnswer(){
		return answer;
	}

	@Override
	public void pollAnswers() {
		Object[] arr = record.values().toArray();
		String t = "", f = "";
		for(int i = 0; i < arr.length; ++i) {
			if(arr[i].toString().equals("t")){
				t+="=";
			} else {
				f+="=";
			}
		}
		System.out.println("t:"+t+"\n"+"f:"+f+"\n");
		
	}

}
