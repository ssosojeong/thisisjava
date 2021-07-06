package sec05.exam02_field_array;

public class Car {
	//인터페이스 객체 배열로 관리 후 구연 객체 대입
	Tire [] tires = {
		new HankookTire(),
		new HankookTire(),
		new HankookTire(),
		new HankookTire()
	};
	
	//각 구현 객체에서의 구현 메소드인 roll() 호출
	void run() {
		for(Tire tire: tires) {
			tire.roll();
		}
	}

}
