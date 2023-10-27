 /*********************************************************************
   *  File            :  abs.java                                      *  
   *  Description     :  To print the number of sides of shapes        *
   *  Author          :  Nygil Johns Joy                               *
   *  Version         :  1.00                                          *
   *  Date            :  27/10/2023                                    *
   *********************************************************************/
package Purejava;

public class abs {
	public static void main(String [] args) {
		Rectangle rectangle=new Rectangle();
		rectangle.numberOfsides();
		Triangle triangle=new Triangle();
		triangle.numberOfsides();
		Hexagon hexagon=new Hexagon();
		hexagon.numberOfsides();
		
		
	}

}
abstract class shape
{
	public void numberOfsides() {
		
	}
	
}
class Rectangle extends shape{
	public void numberOfsides() {
		System.out.println("The number of sides of Rectangle is "+4);
	}
	
}
class Triangle extends shape{
	public void numberOfsides() {
		System.out.println("The number of sides of Trinagle is "+3);
	}
	
}
class Hexagon extends shape{
	public void numberOfsides() {
		System.out.println("The number of sides of Hexagon is "+6);
	}
	
}
	

	