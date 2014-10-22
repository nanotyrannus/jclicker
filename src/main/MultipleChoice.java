package main;
import java.util.Random;
import java.util.HashMap;

public class MultipleChoice implements Question {

	private char[] choices = {'a','b','c','d','e','f'};
	private HashMap<Integer, Character> record = new HashMap<Integer, Character>(); 
	private char answer;
	
	public MultipleChoice(){
		Random rand = new Random();
		answer = choices[rand.nextInt(choices.length)];
	}
	
	public char[] getChoices(){
		return choices;
	}
	
	public void submitAnswer(int s, int a) {
		record.put(s, choices[a]);
	}
	
	public char getAnswer(){
		return answer;
	}

	@Override
	public void pollAnswers() {
		Object[] arr = record.values().toArray();
		String a = "", b = "", c = "", d = "", e = "", f = "";
		for(int i = 0; i < arr.length; ++i) {
			if(arr[i].toString().equals("f")){
				f += "=";
			} else if (arr[i].toString().equals("e")){
				e += "=";
			} else if ((arr[i].toString().equals("d"))){
				d += "=";
			} else if ((arr[i].toString().equals("c"))){
				c += "=";
			} else if (arr[i].toString().equals("b")) {
				b += "=";
			} else {
				a += "=";
			}
				
		}
		System.out.println("a: "+a+"\n"+
			               "b: "+b+"\n"+
			               "c: "+c+"\n"+
			               "d: "+d+"\n"+
			               "e: "+e+"\n"+
			               "f: "+f+"\n");
	}
	
	
	
}
