package com.Inheritance;

class Vehical {
	int wheels = 4;
}

class Car extends Vehical {
	public void showCar() {
		System.out.println(wheels);
	}

}

class Truck extends Vehical {
	public void input() {
		wheels = 16;
	}

	public void showTruck() {

		System.out.println(wheels);
	}


public class HirarchicalDemo {
	public static void main(String[] args) {

		Car c = new Car();
		c.showCar();

		Truck t = new Truck();
		t.input();
		t.showTruck();

	}
}

}
