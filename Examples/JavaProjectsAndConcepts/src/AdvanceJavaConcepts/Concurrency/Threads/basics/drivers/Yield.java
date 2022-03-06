package AdvanceJavaConcepts.Concurrency.Threads.basics.drivers;

import AdvanceJavaConcepts.Concurrency.Threads.basics.threadClasses.MyThreadImplementingYield;

/*
 * yield():   public static native void yield();
 * 
 * method in thread make current running thread to give up running state 
 * and join runnable queue, so that processes with same priority can get the chance, 
 * We use this to avoid starvation(long waiting) of small processes due to a long 
 * running process
 * 
 * 
 */

public class Yield {
	public static void main(String[] args) {

		MyThreadImplementingYield t = new MyThreadImplementingYield();
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Mian thread");
			try {
				Thread.sleep(20);
			} catch (Exception e) {

			}
		}

	}

}
