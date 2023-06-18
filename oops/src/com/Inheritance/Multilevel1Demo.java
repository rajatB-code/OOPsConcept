package com.Inheritance;

class Hotel
{
	String name = "Taj";
}

class menu extends Hotel
{
	String menu = "Coffee";
}

class Bill extends menu
{
	int bill = 350;
	public void showbill() {
		System.out.println(name+" " +menu+ " "+bill);
	}
}


public class Multilevel1Demo {
	public static void main(String[] args) {
		
		Bill b = new Bill();
		b.showbill();
		
	}
	

}
