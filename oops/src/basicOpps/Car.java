package basicOpps;

public class Car {
	int modelNo ;
	String name;
	int price;
	
	public static void main(String[] args) {
		
		Car cc = new Car();
		cc.modelNo = 75346 ;
		cc.name = " BMW ";
		cc.price = 1850000 ;
		System.out.println(cc.modelNo + " " +cc.name + " " +cc.price);
		
		Car cc1 = new Car();
		cc1.modelNo = 85462 ;
		cc1.name = " Tata ";
		cc1.price = 1540000 ;
		System.out.println(cc1.modelNo + " " +cc1.name + " " +cc1.price);
		
		Car cc2 = new Car();
		cc2.modelNo = 78953;
		cc2.name =  "Tesla" ;
		cc2.price = 1480000 ;
		System.out.println(cc2.modelNo + " " +cc2.name+ " " +cc2.price);
		
		
	}

}
