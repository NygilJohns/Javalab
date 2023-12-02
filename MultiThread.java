package Purejava;
import java.util.Random;
class numberGiver{
	private int generatedNumber;
	private boolean numberGenerated=false;
	public synchronized void  generatenumber() {
		generatedNumber= new Random().nextInt(99)+2;
		System.out.println("Generated Random Number :"+generatedNumber);
		numberGenerated=true;
		notifyAll();
	}
	public synchronized void printEvenNumbers() throws InterruptedException {
		while(!numberGenerated || generatedNumber %2!=0) {
			wait();
			
		}
		for(int i=2;i<=generatedNumber;i+=2) {
			System.out.println((i*i)+" ");
			
		}
		System.out.println();
		numberGenerated=false;
	}
	public synchronized void printOddNumbers() throws InterruptedException {
		while(!numberGenerated || generatedNumber %2==0) {
			wait();
			
		}
		for(int i=1;i<=generatedNumber;i+=2) {
			System.out.println((i*i*i)+" ");
			
		}
		System.out.println();
		numberGenerated=false;
	}
	
}
class NumGen extends Thread{
	numberGiver M;
	public NumGen(numberGiver M) {
		this.M=M;
	}
	public void run() {
		while(true) {
			M.generatenumber();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	
}
	}
}
class Evenprinterthread extends Thread{
	numberGiver M;
	public Evenprinterthread(numberGiver M) {
		this.M=M;
		
	}
	public void run() {
		while(true) {
			try {
				M.printEvenNumbers();
				
			}
			catch(InterruptedException e) {
				e.printStackTrace();
				
			}
		}
	}
	
}
class Oddprinterthread extends Thread{
	numberGiver M;
	public Oddprinterthread(numberGiver M) {
		this.M=M;
		
	}
	public void run() {
		while(true) {
			try {
				M.printOddNumbers();
				
			}
			catch(InterruptedException e) {
				e.printStackTrace();
				
			}
		}
	}
	
}


public class MultiThread {
	public static void main(String[] args) {
		numberGiver M=new numberGiver();
		NumGen t=new NumGen(M);
		Evenprinterthread t1=new Evenprinterthread(M);
		Oddprinterthread t2=new Oddprinterthread(M);
		t.start();
		t1.start();
		t2.start();
	
	
	}
}
