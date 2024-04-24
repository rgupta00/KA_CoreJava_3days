package com.session3.java_threads;

class Printer{
	private Object lock=new Object();
	public void print(String message) {
		
		synchronized (lock) {
			System.out.print("[ "+ message);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
			System.out.println("]");
		}
	}
}
class Client implements Runnable{
	private String message;
	private Thread t;
	private Printer printer;
	
	public Client(String message, Printer printer) {
		this.message = message;
		this.printer = printer;
		this.t=new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		printer.print(message);
	}

	
}
public class C_NeedOfSyn {
	
	public static void main(String[] args) {
		
		Printer printer=new Printer();
		Client client1=new Client("i love java", printer);

		Client client2=new Client("i hate java", printer);
		
		Client client3=new Client("i love python", printer);
		
	}

}











