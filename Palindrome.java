  /*********************************************************************
   *  File            :  Palindrome.java                               *  
   *  Description     :  To find whether a number is palindrome or not *
   *  Author          :  Nygil Johns Joy                               *
   *  Version         :  1.00                                          *
   *  Date            :  03/10/2023                                    *
   *********************************************************************/
package Purejava;

import java.util.Scanner;

public class Palindrome {
	
  public static void main(String[] args) {
   
	  Scanner sc = new Scanner(System.in);
   System.out.println("Enter the word:");
   String input = sc.next();
   boolean word=yesPalindrome(input);
   if(word) {
    System.out.println("The typed word is a Palindrome"); 
    }
    else {
     System.out.println("The typed word is not a Palindrome");
    } 
   }
   static boolean yesPalindrome(String input) {
    
	   char[] charArray=input.toCharArray();
       int length=input.length(); 
    for(int i=0;i<length/2;i++)
    
     if(charArray[i]!=charArray[length-i-1])
     {
      return false;
     }
     
   
    return true;
    }}
    
   


