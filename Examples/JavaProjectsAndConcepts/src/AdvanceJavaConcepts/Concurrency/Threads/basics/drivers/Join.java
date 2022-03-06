package AdvanceJavaConcepts.Concurrency.Threads.basics.drivers;

import AdvanceJavaConcepts.Concurrency.Threads.basics.threadClasses.MyThread;

/*
 * join():   public final void join() throws InterruptedException 
 * 
 * method in thread make current running thread to wait until Thread on which it 
 * calls join() to finish.
 * 
 * join(long milisecond):  public final synchronized void join(long millis)
 * join(long milisecond, int nanosecond):  public final synchronized void join(long millis)
 * 
 * 
 * 
 */

public class Join {
	


	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread();
		t1.start();

		/* Main thread will wait till t1 completes */
//		t1.join();
		t1.join(4000);
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Thread: " + Thread.currentThread().getName());
		}

	}

}


