package oop.ajou.ac.kr;

public class Toaster extends Product implements Cooker
{
	Toaster()
	{
		System.out.println("Toaster has been created !");
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
