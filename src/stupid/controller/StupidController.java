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
	}
	
}
