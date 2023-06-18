package com.String1;

public class StringComparison {
	public static void main(String[] args) {
	     /*
	     String str1="Java";
	     String str2="Java";
	     
	     System.out.println("String comparsion with == :"+(str1==str2));
	     */
	    /* 
	     String str1="Java";
	     String str2= new String("Java");
	     
	     System.out.println("String comparsion with == :"+(str1==str2));
	     */
	     
	     //compares references instead content
	     
	     
	     String str1="Java";
	     String str2= new String("Java");
	     
	     System.out.println("String comparsion with == :"+(str1.equals(str2)));
	     
	     // compares content
	     
	     String s1= new String("Welcome");
	     String s2= new String("welcome");
	     
	     System.out.println("== :"+(s1==s2));
	     System.out.println("equals:"+(s1.equals(s2)));
	     System.out.println("equals Case:"+(s1.equalsIgnoreCase(s2)));
	     
	     

		}


}
