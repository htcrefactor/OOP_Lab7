package oop.ajou.ac.kr;

public class ProductTest {
	ProductTest(){};
	
	public static void main(String args[]){
		SmartTV tv=new SmartTV();
		Laptop l=new Laptop();
		Toaster t=new Toaster();
		
		ProductTest pt=new ProductTest();
		
		pt.testProduct(tv);
	}
	
	public void testProduct(Product p){
		p.setPrice(153);
		System.out.println("Price: "+p.getPrice());
		System.out.println("Name: "+p.getName());
	}
	
	public void testDataStorage(DataStorage d){
		System.out.println("Free Capacity: "+d.getFreeCapacity());
		d.format();
	}
	
	public void testNetworked(Networked n){
		System.out.println("This is connected? "+n.isConnected());
		System.out.println("Max Speed: "+n.maxSpeed());
	}
	
	public void testCooker(Cooker c){
		System.out.println("Did you make toast? "+c.prepareFood());
	}
}