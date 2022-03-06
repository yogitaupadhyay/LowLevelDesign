package AdvanceJavaConcepts.Concurrency.Threads.basics.threadClasses;


/*  
 * Please Note creating thread using Runnable is recommended as
 * it will allow you to inherit other classes as well
 *  
 *  
*/
public class MyThreadUsingRunnable implements Runnable{
	
	public  void run() {
		System.out.println("ThreadName " + Thread.currentThread().getName());
	
		
	}

}
