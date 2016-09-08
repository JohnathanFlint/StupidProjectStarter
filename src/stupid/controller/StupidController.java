package stupid.controller;

public class StupidController 
{
	private String myName;
	public StupidController() //constructor = public name of class
	{
		myName = "Spatula";
	}
	public void start()
	{
		System.out.println("this program is as stupid as before");
		System.out.println(myName);
	}
}
