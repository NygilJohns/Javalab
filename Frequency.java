 /************************************************************************
   *  File            :  Frequency.java                                  *
   *  Description     :  To find the frequency of a letter in a sentence *
   *  Author          :  Nygil Johns Joy                                 *
   *  Version         :  1.00                                            *
   *  Date            :  03/010/2023                                     *
   ***********************************************************************/
package Purejava;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		System.out.println("Enter the sentence:");

		String input=sc.nextLine();
		System.out.println("Enter the letter:");
		char letter=sc.next().charAt(0);
		int sent=checkfrequency(input,letter);
		if(sent>0) 
			System.out.println("The frequency="+sent);
		
		else 
			System.out.println("The letter is not present");

}
	static char checkfrequency(String input,char letter) {
		Scanner sc= new Scanner(System.in);
		char count=0;
		char a[]=input.toCharArray();
		int len=input.length();
		for(int i=0;i<len;i++){
			if(letter==a[i]) 

				count++;
		}

		return count;

 }
}


	

