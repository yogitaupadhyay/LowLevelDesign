package AdvanceJavaConcepts.Concurrency.Threads.overrideRunnable.threadClasses;

/*  
 * Please Note creating thread using Runnable is recommended as
 * it will allow you to inherit other classes as well
 *  
 *  
*/
public class MyThread extends Thread {

	@Override
	public void run() {
		// job of thread
		System.out.println("Thread name: " + Thread.currentThread().getName());
	
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName()+": child thread");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {

			}
		}

	}

}
