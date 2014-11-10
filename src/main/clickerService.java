package main;

import java.util.Random;

public class clickerService {
    private Random rng = new Random();
	private Student[] classroom = new Student[1+rng.nextInt(100)];
	private Question[] quiz = new Question[1+rng.nextInt(100)];

    public clickerService(){
    	for(int i = 0; i < classroom.length; ++i) {
    		classroom[i] = new Student();
    	}
    	for(int i = 0; i < quiz.length; ++i){
    		if(i < (1/4.0)*quiz.length){
    			quiz[i] = new TrueFalse();
    		} else {
    			quiz[i] = new MultipleChoice();
    		}
    	}
    }
    
    public void beginQuiz(){
    	for(int a = 0; a < classroom.length; ++a){
    		for(int b = 0; b < quiz.length; ++b){
    			classroom[a].recieveQuestion(quiz[b]);
    		}
    	}
    	
    	//Code below simulates random students changing their mind
    	Random rand = new Random();
    	for(int i = 0; i < rand.nextInt(classroom.length); ++i){
    		classroom[rand.nextInt(classroom.length)].recieveQuestion(quiz[rand.nextInt(quiz.length)]);
    	}
    }
	
    public void printResults(){
    	for(int i = 0; i < quiz.length; ++i){
    		System.out.println("Question " + (i+1));
    		quiz[i].pollAnswers();
    	}
    	System.out.println("Students: " + classroom.length + ", questions: " + quiz.length);
    }
}
