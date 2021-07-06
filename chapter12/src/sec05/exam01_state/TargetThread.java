package sec05.exam01_state;

public class TargetThread extends Thread {

	@Override
	public void run() {
		int sum = 0;
		for(long i=0; i<1000000000; i++) { sum += i; }
		
		try { Thread.sleep(1500); } catch (InterruptedException e) {}
		
		for(long i=0; i<1000000000; i++) { sum += i; }
	}
	
	

}
