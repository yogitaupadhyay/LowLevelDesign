package AdvanceJavaConcepts.Concurrency.Threads.InterThreadCommu;


/* 
 *   ================InterThreadCommunication=================
 *   
 *   
 * 1. Wait, notify, notifyAll is present in object class not thread class
 * 
 * 2. To call wait or notify or notifyAll method on any object
 *    thread needs to own that object, by owning an object 
 *    means, thread needs to have lock of that object. Therefore to call 
 *    wait, notify, notifyAll thread needs to be in synchronized section 
 *    or can say where call is made has to be synchronized.
 *  
 *    Otherwise we will get run time exception `illegalMoniterStateException`
 *  
 * 3.  When thread calls wait() method on any object, then it releases the lock 
 *     of that object immediately, and then enter into waiting state.
 *     
 * 4.  When thread calls notify() method on any object, then it releases the lock 
 *     of that object but may not immediately, as it might need to do some work.
 *     
 * 5.   public final void wait() throws InterruptedException 
 *      public final native void wait(long ms) throws InterruptedException 
 *      public final void wait(long ms, int nanosec) throws InterruptedException 
 *      
 * 6.   public final native void notify()
 *      public final native void notifyAll()
 *  
 *   */
public class MainThread {

	public static void main(String[] args) throws Exception {
		System.out.println("main thread started");

		ChildThread b = new ChildThread();
		b.start();
		System.out.println("main thread starte9d");
		/*
		 * Method -1 (Join())
		 * 
		 * b.join();// first child thread would complete
		 * System.out.println("total: "+b.total);
		 * 
		 * Problem with this is that total might get calculated much earlier than time
		 * when thread job would complete
		 */

		
		/*
		 * Method -2 (Sleep())
		 * 
		 * Thread.sleep(100); 
		 * System.out.println("total: "+b.total);
		 * 
		 * Problem with this is that total might get calculated much earlier than time
		 * calling thread would sleep.
		 */
		
		
		
		
		/*
		 * // Method- 3 
		 * // If child thread gets chance first, then it would be dead
		 * // before even wait is called, thus this main would be waiting forever.
		 *  
		 * 
		 * synchronized(b) { System.out.println("calling wait"); b.wait();
		 * System.out.println("total: "+b.total); }
		 */
		 
		
		Thread.sleep(100);// simulating the case where child thread is called first
		synchronized (b) {
			System.out.println("calling wait");
			b.wait(1000);// now even if child is called before, it would go fine
			System.out.println("total: " + b.total);
		}
		 
		
		System.out.println("main thread completed");

	}

}
