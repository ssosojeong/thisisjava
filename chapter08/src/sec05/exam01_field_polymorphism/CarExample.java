package sec05.exam01_field_polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		
		myCar.run();
		
		//두 개를 KumhoTire로 교체
		//Car 클래스를 수정하지 않고 필드의 객체를 교체함으로써 다양한 결과를 냄
		//다형성
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();

	}

}
