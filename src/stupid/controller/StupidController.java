package stupid.controller;

import java.util.Scanner;

public class StupidController
{
	private String myName; //Data Members
	private Scanner inputReader;

	public StupidController() // constructor = public name of class
	{
		myName = "Spatula";
		inputReader = new Scanner(System.in);
	}

	public void start()
	{
		System.out.println("this program is as stupid as before");
		System.out.println(myName);
		askQuestions();
	}
	
	private void askQuestions()
	{
		System.out.println("How was your day?");
		String input = inputReader.nextLine();
		System.out.println("Oh, you said: " + input + ", I hate you.");
		
		System.out.println("My next question is this: what is the best type of food");
		String foodInput = inputReader.next();
		System.out.println("Ok, you typed this: " + foodInput);
		
		System.out.println("What is the answer to life, the universe, and everything?");
		Integer everythingInput = inputReader.nextInt();
		System.out.println(everythingInput + "? shouldn't it be 6*7?");
		
		String responseInput = inputReader.next();
		System.out.println(responseInput + "? Clearly I am right!");
		
		
	}
	
}
