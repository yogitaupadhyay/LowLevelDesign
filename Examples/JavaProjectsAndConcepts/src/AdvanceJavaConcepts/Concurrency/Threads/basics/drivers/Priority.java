package AdvanceJavaConcepts.Concurrency.Threads.basics.drivers;

import AdvanceJavaConcepts.Concurrency.Threads.basics.threadClasses.MyThreadUsingRunnable;

public class Priority {

	public static void main(String[] args) {
		MyThreadUsingRunnable t = new MyThreadUsingRunnable();
		Thread actualThread = new Thread(t);

		/* Default priority of Main thread is 5 */
		System.out.println("main default Priority: " + Thread.currentThread().getPriority());

		/*
		 * You can define thread priority from 1 to 10 ( 1 - min and 10 - max and 5
		 * -norm)
		 */
		System.out.println("MAX_PRIORITY: " + Thread.MAX_PRIORITY);
		System.out.println("MIN_PRIORITY: " + Thread.MIN_PRIORITY);
		System.out.println("NORM_PRIORITY: " + Thread.NORM_PRIORITY);

		/* Default Priority of any thread is inherited by its parent */
		System.out.println("child default Priority: " + actualThread.getPriority());

		/* Setting thread priority */

		Thread.currentThread().setPriority(7);
		System.out.println("main  Priority: " + Thread.currentThread().getPriority());// 7
		System.out.println("child Priority: " + actualThread.getPriority());// remains - 5

		Thread t2 = new Thread();
		System.out.println("t2 Priority: " + t2.getPriority()); // got 7 from parent

		/* Setting thread priority beyond limit - Illegal argument exception */
		// Thread.currentThread().setPriority(19);

	}

}
