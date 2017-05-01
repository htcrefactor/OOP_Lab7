package oop.ajou.ac.kr;

public class SmartTV {
	private int channel;
	
	public void SmartTV()
	{
		System.out.println("We create the SmartTV");
	}
	public boolean isConneected()
	{
		return true;
	}
	
	public double maxSpeed()
	{
		return 158.7;
	}
	
	public String getName();
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	
}
