package AdvanceJavaConcepts.Concurrency.Threads.InterThreadCommu;

public class ChildThread extends Thread {
	public int total = 0;

	public void run() {
		synchronized (this) {
			System.out.println("child thread started");
			for (int i = 1; i <= 100; i++) {
				this.total = this.total + i;
			}

			this.notify();
			System.out.println("child thread completed");
		}

		// some other huge number lines of code
	}

}
