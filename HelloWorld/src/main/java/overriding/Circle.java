package overriding;

public class Circle extends Shape{

	public static void main(String[] args) {
	Circle c=new Circle();
	c.area();
	}
	public void area()
	{
float p=3.1f;
int r=10;
area=p*r*r;
System.out.println("area of clrcle is"+area);
	}
}