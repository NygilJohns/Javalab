package Purejava;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
public class FileReadWrite {
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String data=sc.nextLine();
		   FileWriter input=null;
		   FileReader output=null;
		   char [] data1=new char[50];
		   try {
			   input=new FileWriter("input.txt");
			   input.write(data);
			  // System.out.println("input.txt");
			  // System.out.println(data);
			   input.flush();
			   input.close();
			   output=new FileReader("input.txt");
			   int bytes = output.read(data1);
			   output.close();
			   input=new FileWriter("output.txt");
			   input.write(data1,0,bytes);
			   //System.out.println("output.txt");
			   //System.out.println(data1);
			   input.flush();
			   input.close();
		   }
		   catch(IOException e) {
			   e.printStackTrace();
		   }
	}

}
