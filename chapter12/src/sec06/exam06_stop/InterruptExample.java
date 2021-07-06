package sec06.exam06_stop;

public class InterruptExample {

	public static void main(String[] args) {
		//PrintThread2 thread = new PrintThread2();	랑 똑같음
		Thread thread = new PrintThread2();
		thread.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) { }
		
		thread.interrupt();
		
	}

}
