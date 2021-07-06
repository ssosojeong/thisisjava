package sec08.exam01_abstract_class;

public class PhoneExample {

	public static void main(String[] args) {
		
		//abstract class기 때문에 "직접 new 연산자로" 객체 생성 불가
		//Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		

	}

}
