package Purejava;

public class AreaofShapes {
public static void main(String [] args) {
	Shape shape=new Shape();
	Shape.area(12.5f,13.5f);
	Shape.area(15,30);
	Shape.area(17,5f);
	
}
}
class Shape{
	public static void area(int length,int breadth ) {
		System.out.println("Area of Rectangle="+(length*breadth));
	}
	public static void area(float height,float base) {
		System.out.println("Area of Triangle="+(0.5*height*base));
	}
	public static void area(float radius) {
		System.out.println("Area of Circle="+(3.14*radius*radius));
	}

	}

