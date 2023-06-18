package assignmentOnObjectAndClass;

public class Rectangle {
	int length;
	int width;
	
	void insert (int l,int w)
	{
		length = l;
		width = w;
	}
	void calculateArea()
	{
		System.out.println(length * width);
	}

  }
    class TestRectangle1{
    	public static void main(String[] args) {
			Rectangle s1 = new Rectangle();
			Rectangle s2 = new Rectangle();
			
			s1.insert(11, 5);
			s2.insert(3, 15);
			
			s1.calculateArea();
			s2.calculateArea();
		}
    }