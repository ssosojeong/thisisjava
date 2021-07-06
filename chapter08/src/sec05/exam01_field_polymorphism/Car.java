package sec05.exam01_field_polymorphism;

public class Car {
	//모든 필드를 인터페이스 Tire 타입으로 선언
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	//각 구현 객체에서의 구현 메소드인 roll() 호출
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}

}
