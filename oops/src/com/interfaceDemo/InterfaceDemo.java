package com.interfaceDemo;


interface Moveable{
	int x = 23;
	
	void move();
	
	default void run() {
		System.out.println("run");
	}
	
	static void stop() {
		System.out.println("Stop......");
	}
	
}

class Bus implements Moveable{
	public void move() {
		System.out.println("Bus is running....");
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		Moveable m = new Bus();
		m.move();
		m.run();
		Bus b = new Bus();
		b.run();
		b.move();
		
		Moveable.stop();
	}

}
