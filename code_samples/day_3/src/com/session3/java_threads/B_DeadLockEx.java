package com.session3.java_threads;
/*
 * 
C:\Users\busyc\OneDrive\Desktop\threaddumpdemo>jps -l
21316 day_3/com.session3.java_threads.B_DeadLockEx
24952 Eclipse
2936 org.springframework.ide.vscode.boot.app.BootLanguageServerBootApp
2380 sun.tools.jps.Jps

C:\Users\busyc\OneDrive\Desktop\threaddumpdemo>jstack 21316 > dump.txt

C:\Users\busyc\OneDrive\Desktop\threaddumpdemo>
 */
public class B_DeadLockEx {

	public static void main(String[] args) {
		//deadlock avoidance algo
		Object r1 = "bat";
		Object r2 = "ball";

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (r1) {
					System.out.println("Thread t1 have taken the lock on r1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}

					synchronized (r2) {
						System.out.println("Thread t1 have taken the lock on r2");
					}
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (r2) {
					System.out.println("Thread t2 have taken the lock on r2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}

					synchronized (r1) {
						System.out.println("Thread t2 have taken the lock on r1");
					}
				}
			}
		});
		
		t1.start();
		t2.start();
	}
}
