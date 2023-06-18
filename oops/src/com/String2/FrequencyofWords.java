package com.String2;

public class FrequencyofWords {

		public static void freq(String st) {

		st = st.toLowerCase();

		String[] sarr= st.split("\\s");

		int count;

		for (int i = 0;  i<sarr.length; i++) 
		{
		if(sarr[i].equals("visited"))
		{
			continue;
		}
		count  = 1 ;
		//System.out.println(sarr[i]);
		for (int j = i + 1 ;j<sarr.length; j++) 
		{
		if(sarr[i].equals(sarr[j]))
		{
			count++;
			sarr[j]="visited";
		}
	}
		System.out.println(sarr[i]+"  "+count);
	}
		
}
		public static void main(String[] args){
			String st = "java is easy ";
			System.out.println(st);
			
			FrequencyofWords.freq(st);
			
			
		}
}
			