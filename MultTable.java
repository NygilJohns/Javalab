package Purejava;

class MultiplicationTable{
	synchronized void multitable(int number) {
		for(int i=1;i<=10;i++) {
			System.out.println(i+"X"+number+"="+i*number);
		}
		}
	}
class Mythread extends Thread{
	MultiplicationTable t;
	Mythread(MultiplicationTable t){
		this.t=t;
		
	}
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
		t.multitable(2);
	}
}
class MyThread1 extends Thread{
	MultiplicationTable t;
	MyThread1(MultiplicationTable t){
		this.t=t;
		
	}
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
		t.multitable(5);
	}
}
class MyThread2 extends Thread{
	MultiplicationTable t;
	MyThread2(MultiplicationTable t){
		this.t=t;
		
	}
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
		t.multitable(8);
	}
}
public class MultTable {
	public static void main(String [] args) {
		MultiplicationTable m=new MultiplicationTable();
		Mythread t=new Mythread(m);
		MyThread1 t1=new MyThread1(m);
		MyThread2 t2=new MyThread2(m);
		t1.setPriority(2);
		t.start();
		t1.start();
		t2.start();
		
	}
	
}
