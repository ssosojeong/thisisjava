package sec07.exam03_field_polymorphism;

public class Tire {
	public int maxRotation;			//타이어의 최대 회전수 (교체해야 하는 회전수)
	public int accumulatedRotation;	//누적 회전수
	public String location;			//해당 타이어가 어디에 위치한 타이어인지 
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명: " + (maxRotation - accumulatedRotation));
			return true;
		} else { 
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
	

}
