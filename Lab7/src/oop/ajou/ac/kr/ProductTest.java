package oop.ajou.ac.kr;

public class ProductTest {
	ProductTest() {
	};

	public static void main(String args[]) {
		SmartTV tv = new SmartTV();
		System.out.println();

		Laptop l = new Laptop();
		System.out.println();

		Toaster t = new Toaster();
		System.out.println();

		ProductTest pt = new ProductTest();

		pt.testProduct(tv);
		System.out.println();

		pt.testProduct(l);
		System.out.println();

		pt.testProduct(t);
		System.out.println();

		pt.testDataStorage(l);
		System.out.println();

		pt.testNetworked(tv);
		System.out.println();

		pt.testNetworked(l);
		System.out.println();

		pt.testCooker(t);
		System.out.println();
	}

	public void testProduct(Product p) {
		p.setPrice(153);
		System.out.println("Price: " + p.getPrice());
		System.out.println("Name: " + p.getName());
	}

	public void testDataStorage(DataStorage d) {
		System.out.println("Free Capacity: " + d.getFreeCapacity());
		d.format();
	}

	public void testNetworked(Networked n) {
		System.out.println("This is connected?\n" + n.isConnected());
		System.out.println("Max Speed: " + n.maxSpeed());
	}

	public void testCooker(Cooker c) {
		System.out.println("Did you make toast? \n" + c.prepareFood());
	}
}