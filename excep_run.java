package Purejava;
import java.util.Scanner;
public class excep_run {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		char choice='y';
		while(choice=='y') {
			try {
			System.out.println("Enter Number 1 :");
			int num1=sc.nextInt();
			System.out.println("Enter Number 2 :");
			int num2=sc.nextInt();
			int result=num1/num2;
			System.out.println("Result :"+result);
		}
		
		
		catch(ArithmeticException s) {
			System.out.println("Sorry man zero nahi nahi");
			
		}
			finally {
				System.out.println("End of operation");
			}
			
			System.out.println("Do you want to continue Y or N");
			choice=sc.next().charAt(0);
		}
	}

}
