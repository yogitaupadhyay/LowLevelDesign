package AdvanceJavaConcepts.Concurrency.Threads.deadlock;

public class driver {

	public static void main(String[] args) {
		
		childThread ch=new childThread();
		ch.m1();//main calling m1
		
	}

}
