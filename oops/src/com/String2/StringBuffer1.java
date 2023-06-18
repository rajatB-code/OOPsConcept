package com.String2;

public class StringBuffer1 {
	public static void main(String[] args) {
		String str = "Java";
		System.out.println(str.hashCode());
		
		str = str +"Program";
		System.out.println(str.hashCode());
		
		StringBuffer sb = new StringBuffer("java");
		System.out.println(sb.hashCode());
		sb = sb.append("Program");
		
		System.out.println(sb.hashCode());
	}

}
