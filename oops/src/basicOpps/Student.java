package basicOpps;

public class Student {
	
		
		int id;
		String name;
		int sub1;
		int sub2;
		int sub3;
		double per;
		
		public void acceptdetails(int sid,String sname,int Msub1,int Ssub2,int Rsub3) 
		{
			id= sid;
			name=sname;
			sub1=Msub1;
			sub2=Ssub2;
			sub3=Rsub3;	
		}
		public void calculatePercentage()
		{
			per =(sub1 + sub2 + sub3) / 3 ;
			
			if(per >= 60) {
				System.out.println("Grade A");
			}
			else {
				System.out.println("grade c");
			}
		}
		
		
		public void displayDetail()
		{
			
			System.out.println((id+ " " +name+ " " +sub1+" "+sub2+" " +sub3+" "+per));
		}
		public static void main(String[] args) {
			
			
			Student stud=new Student();
		       stud.acceptdetails(101, "yash", 78, 67, 44);
		       stud.calculatePercentage();
		       stud.displayDetail();
		}
	}


