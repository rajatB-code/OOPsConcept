package com.Inheritance;

class Student
{
   String name = " ";	
}

class Subject extends Student
{
   public void show() {
	   String name = "Computer";
	   System.out.println(name);
   }
}


public class Single2Demo {
	public static void main(String[] args) {
		
		Subject s = new Subject();
		s.show();
	}
	

}
