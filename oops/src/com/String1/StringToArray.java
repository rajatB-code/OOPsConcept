package com.String1;

public class StringToArray {
	public static void main(String[] args) {

	     String str= "Java";
	     
	     char ch[]= str.toCharArray();
	     int len=0;
	     
	     for(char c:ch)
	     {
	    	 len++;
	     }
	          
	     System.out.println("Length is:"+len);
	       
		}


}
