package main;

import java.util.Random;

public class Student {

	private String iden = "";
	
	public Student(){
		Random rand = new Random();
		for(int i = 0; i < 20; ++i){
			iden += rand.nextInt(10) + 1 + "";
		}
	}
	
	public String getID(){
		return iden;
	}
	
}
