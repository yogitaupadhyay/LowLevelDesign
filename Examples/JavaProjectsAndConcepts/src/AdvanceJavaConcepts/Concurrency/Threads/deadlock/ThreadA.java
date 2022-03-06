package AdvanceJavaConcepts.Concurrency.Threads.deadlock;

public class ThreadA extends Thread {

	public void run() {

	}

	synchronized void  funA(ThreadB b) {
		System.out.println("A got lock");
		b.last();
		System.out.println("B releases lock");
	}

	synchronized void  last() {
		for (int i = 0; i < 5; i++) {
			System.out.print("A");
		}
	}

}
