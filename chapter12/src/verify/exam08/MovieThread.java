package verify.exam08;

public class MovieThread extends Thread{

	@Override
	public void run() {
		while(true) {
			System.out.println("동영상을 재생합니다.");
		
			if(this.isInterrupted()) {
				System.out.println("스레드를 종료합니다.");
				break;
			}
			
		}
	}

}
