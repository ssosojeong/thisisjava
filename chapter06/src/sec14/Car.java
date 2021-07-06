package sec14;

public class Car {
	//필드
	private int speed;
	private boolean stop;
	
	//getter 
	public int getSpeed() {
		return speed;
	}
	//setter
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0;
			return;				//음수면 0으로 저장하고 return으로 메소드 종료
		} else {
			this.speed = speed;
		};
	}
		
	//getter
	public boolean isStop() {
		return stop;
	}
	//setter
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop==true) { speed=0; }
	}
	
}
