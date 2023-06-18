package com.Inheritance;

class Person {
	String name = "Amit";
}

class Employee extends Person {
	int salary = 89000;
}

class Manager extends Employee {
	int commition = 4500;

	public void showDetails() {
		System.out.println(name + " " + salary + " " + commition);
	}
}


public class MultilevelDemo {
	public static void main(String[] args) {
		Manager m = new Manager();
		m.showDetails();

	}


}
