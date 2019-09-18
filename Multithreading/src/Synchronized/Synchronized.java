package Synchronized;

public class Synchronized {
	public static void main(String[] args) {
		Display d=new Display();
		MyThread t1=new MyThread(d,"dhoni");
		MyThread t2=new MyThread(d,"yuvraj");
		t1.start();
		t2.start();
		
	}

}
