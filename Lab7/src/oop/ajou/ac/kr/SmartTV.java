package oop.ajou.ac.kr;

public class SmartTV extends Product implements Networked{
	private int channel;
	
	SmartTV()
	{
		System.out.println("We create the SmartTV.");
	}

	public double maxSpeed()
	{
		return 158.7;
	}
	
	public String getName()
	{
		return "Bronze SmartTV";
	}
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if (channel<0) this.channel=0;
		else this.channel = channel;
	}

	public boolean isConnected() {
		return true;
	}
	
}
