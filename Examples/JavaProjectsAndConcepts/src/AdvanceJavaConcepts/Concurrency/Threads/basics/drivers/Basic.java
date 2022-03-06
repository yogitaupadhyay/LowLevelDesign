package AdvanceJavaConcepts.Concurrency.Threads.basics.drivers;

import AdvanceJavaConcepts.Concurrency.Threads.basics.threadClasses.MyThread;
import AdvanceJavaConcepts.Concurrency.Threads.basics.threadClasses.MyThreadUsingRunnable;

public class Basic {

	public static void main(String[] args) {

		/* Create thread Extending thread class */
		MyThread t1 = new MyThread();

		/* Create thread by Implementing runnable class */
		MyThreadUsingRunnable t = new MyThreadUsingRunnable();
		Thread actualThread = new Thread(t);

		/*
		 * If you will call run directly without calling start, then it JVM won't create
		 * thread it would be a simple function call
		 */

		// System.out.println("Calling run");
		// t1.run();

		/* Starting new thread */
		t1.start();
		actualThread.start();

		/* Now at this point we got 3 threads- t1, actualThread, main */

		/* Get Thread Name */
		System.out.println("Thread: " + Thread.currentThread().getName());

		/* set Thread Name */
		Thread.currentThread().setName("MyThread");
		System.out.println("Thread name after setting: " + Thread.currentThread().getName());

	}

}
