package oop.ajou.ac.kr;

public class Laptop extends Product implements Networked,DataStorage {
	
	double totalCapacity;
	double usedCapacity;
	
	Laptop(){
		System.out.println("We create the Laptop.");
	};
	
	public double getFreeCapacity(){
		return 0;
	}
	
	public void format(){
		System.out.println("Start formating.");
	}
	
	public boolean isConnected(){
		return true;
	}
	
	public double maxSpeed(){
		return 134.1;
	}

	public double getTotalCapacity() {
		return totalCapacity;
	}

	public void setTotalCapacity(double totalCapacity) {
		if(totalCapacity>0){
			this.totalCapacity = totalCapacity;
		}
		
		else
			this.totalCapacity=0;
	}

	public double getUsedCapacity() {
		return usedCapacity;
	}

	public void setUsedCapacity(double usedCapacity) {
		if(totalCapacity>0){
			this.usedCapacity = usedCapacity;
		}
		
		else
			this.usedCapacity=0;
	}
	
	public String getName(){
		return "Gold Laptop";
	}
}
