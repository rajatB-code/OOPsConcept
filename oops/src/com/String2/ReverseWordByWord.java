package com.String2;

public class ReverseWordByWord {
	public static void revworld(String s) {
		String st[] = s.split("\\s");
		
		String rev = " ";
		
		for(int i=0; i<st.length; i++) {
			for(int j=st[i].length()-1; j>=0; j--) 
			{
				rev = rev +st[i].charAt(j);
				
			}
			rev = rev +" ";
		}
		System.out.println(rev);
	}
	
	public static void main(String[] args) {
		String str = "I like java";
		
		System.out.println("Original : " +str);
		
		revworld(str);
	}

}
