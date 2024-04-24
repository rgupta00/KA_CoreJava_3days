package com.session3.java_threads;
//create a thread and assign job to that therad

//Runnable is used to create the job
class Job implements Runnable{
	@Override
	public void run() {
		System.out.println("job started by the thread : "+ Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("job end by the thread : "+ Thread.currentThread().getName());
	}
	
}
public class A_HelloWorldThread {
	
	public static void main(String[] args) {
		
		
		System.out.println("Main thread started: "+ Thread.currentThread().getName());
		Job job=new Job();
		Thread thread1=new Thread(job, "A");
		thread1.setPriority(Thread.MAX_PRIORITY);
		
		Thread thread2=new Thread(job, "B");
		Thread thread3=new Thread(job, "C");
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		//how to force main so that till other thread not finished it should not finished
		
		try {
			thread1.join();// it means that thread1 is saying to main join after me
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Main thread finished: "+ Thread.currentThread().getName());
		
		
		
		
		//Alternative way to create the threads
		
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("job of the thread");
			}
		});
		
		//Alternative way to create the threads
	      Thread t2=new Thread(()-> System.out.println("job of the thread"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
