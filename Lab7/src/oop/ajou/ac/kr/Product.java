package oop.ajou.ac.kr;

abstract public class Product 
{
	private double price;
	//fghjf
	public double getPrice() 
	{
		return price;
	}
	
	public void setPrice(double price) 
	{
		this.price = price;
	} 
	
	public abstract String getName();
}
