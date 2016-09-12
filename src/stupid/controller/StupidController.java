package stupid.controller;

import java.util.Scanner;

public class StupidController
{
	private String myName; //Data Members
	private Scanner inputReader;
	private String itsName;

	public StupidController() // constructor = public name of class
	{
		myName = "Spatula";
		inputReader = new Scanner(System.in);
		itsName = "Ted";
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
		int everythingInput = inputReader.nextInt();
		System.out.println(everythingInput + "? shouldn't it be 6*7?");
		
		String responseInput = inputReader.next();
		System.out.println(responseInput + "? Clearly I am right!");
		inputReader.nextLine(); //Consumes unneeded potential input.
		
		System.out.println("What is my name?");
		String itsNameInput = inputReader.nextLine();
		if(itsNameInput.equalsIgnoreCase ("Tedd")) 
		{
			System.out.println("Hey you remembered that my name is " + itsNameInput + "!");
			
			System.out.println("What is the median of 1, 2, 3, 4, 5, 6");
			double decimalInput = inputReader.nextDouble();
			System.out.println("What even is a median?");
			inputReader.nextLine();
			
			String medianInput = inputReader.nextLine();
			System.out.println("Okay, I trust you completely");
		}
		else
		{
			System.out.println("You can't even remember my name! I hate you!");
			
			System.out.println("What is the median of 1, 2, 3, 4, 5, 6");
			double decimalInput = inputReader.nextDouble();
			System.out.println("What even is a median?");
			inputReader.nextLine();
			
			String medianInput = inputReader.nextLine();
			System.out.println("Why should I trust you you're a horrible person!");
			
			String trustInput = inputReader.nextLine();
			System.out.input
		}
			//for(int counter = 0;counter<50;counter++){} 
		
		
	}
	
}
