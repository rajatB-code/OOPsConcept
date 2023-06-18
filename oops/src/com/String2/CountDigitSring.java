package com.String2;

public class CountDigitSring {
	public static void CountDigit(String str)
	{
		char ch[] = str.toCharArray();
		int count = 0;
		for(int i = 0; i<ch.length; i++) 
		{
			if(ch[i]>='1' && ch[i]<='9')
			{
			    count++;
			}
			
		}
		System.out.println("Total NUmber of Digit : " +count);
	}
	
	public static void main(String[] args) {
		String str = "s12gh568rt";
		
		CountDigit(str);
		
		
	}

}
