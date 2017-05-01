package oop.ajou.ac.kr;

public class Toaster extends Product implements Cooker
{
	Toaster() // This is a constructor !
	{
		System.out.println("We create the Toaster.");
	}
	
	public String prepareFood()
	{
		return "Finished !";
	}
	
	public String getName()
	{
		return "Silver Toaster";
	}
}
