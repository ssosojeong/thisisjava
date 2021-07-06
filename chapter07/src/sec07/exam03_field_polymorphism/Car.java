package sec07.exam03_field_polymorphism;

public class Car {
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	//각 타이어의 roll() 메소드를 호출시키는 메소드
	//정상적으로 회전하면 0 리턴, 어떤 타이어가 펑크나면 그 펑크난 타이어의 순번을 리턴
	int run() {
		System.out.println("자동차가 달립니다.");
		if(frontLeftTire.roll() == false) {
			stop(); 
			return 1;
		} 
		if(frontRightTire.roll() == false) {
			stop(); 
			return 2;
		} 
		if(backLeftTire.roll() == false) {
			stop(); 
			return 3;
		} 
		if(backRightTire.roll() == false) {
			stop(); 
			return 4;
		} 
		return 0;
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}

}
