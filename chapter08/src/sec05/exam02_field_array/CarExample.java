package sec05.exam02_field_array;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		
		myCar.run();
		
		//두 개를 KumhoTire로 교체
		//Car 클래스를 수정하지 않고 필드의 객체를 교체함으로써 다양한 결과를 냄
		//다형성
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();
		
		myCar.run();

	}

}
