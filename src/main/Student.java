package main;
import java.util.Random;

public class Student {
	private Integer iden;
	private Random rand = new Random();
	public Student(){
		iden = rand.nextInt();
	}
	public Integer getID(){
		return iden;
	}
	
	public void recieveQuestion(Question q) {
		q.submitAnswer(iden, rand.nextInt(q.getChoices().length));
	}
}