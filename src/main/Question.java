package main;

public interface Question {

	public void submitAnswer(int s, int a);
	public void pollAnswers();
	public char[] getChoices();
	public char getAnswer();
}
