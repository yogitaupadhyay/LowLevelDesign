package AdvanceJavaConcepts.Concurrency.Threads.basics.threadClasses;

public class MyThreadImplementingYield extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("This is very long process");
			Thread.yield();
			try {
				Thread.sleep(200);
			} catch (Exception e) {

			}

		}
	}

}
