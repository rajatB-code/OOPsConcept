package com.Inheritance;

	
	class Laptop
	{
		int modelNo = 121;
	}
	
	class Brand extends Laptop
	{
		String Sname = "Dell";
	}
	
	class Storage extends Brand
	{
		String ram = "64gb";
		public void StudDetail() {
			System.out.println(modelNo+ " "+Sname+" "+ram);
		}
		
	}
	public class Multilevel2Demo {
		public static void main(String[] args) {
			Storage s = new Storage();
			s.StudDetail();
		}

}
