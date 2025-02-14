package overriding;

public class Rectangle extends Shape{

	public static void main(String[] args) {
	Rectangle r=new Rectangle();
	r.area();
	                                       }
	
		public void area()
		{
	int length=10,breadth=20;
	area=length*breadth;
	System.out.println("area of rectangle is"+area);
		}
	

}
