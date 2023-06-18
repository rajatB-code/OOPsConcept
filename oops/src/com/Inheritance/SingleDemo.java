package com.Inheritance;

class Animal {
	int legs = 0;
}

class Dog extends Animal {
	public void show() {
		legs = 4;
		System.out.println(legs);
	}
}



public class SingleDemo {
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.show();
	}

}
