package AdvanceJavaConcepts.Concurrency.Threads.deadlock;

public class ThreadB extends Thread {
	public void run() {
		
	}
	
	synchronized void funB(ThreadA a){
		System.out.println("B got lock");
		a.last();
		System.out.println("B releases lock");
	}
	synchronized void last() {
		for(int i=0;i<5;i++){
			/*
			 * try { Thread.sleep(10000); }catch(Exception e) {
			 * 
			 * }
			 */
			System.out.print("B");
		}
		
	}

}
