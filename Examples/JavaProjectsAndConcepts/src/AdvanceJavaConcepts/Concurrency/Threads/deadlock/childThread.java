package AdvanceJavaConcepts.Concurrency.Threads.deadlock;

public class childThread extends Thread{
	ThreadA t1=new ThreadA();
	ThreadB t2=new ThreadB();

	
	void m1() {
		this.start();// start child thread
		t1.funA(t2); //main Thread calling FunA
		
	}
	
	public void run() {
		t2.funB(t1);// child thread calling funB
	}

}
