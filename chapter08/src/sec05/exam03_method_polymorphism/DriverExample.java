package sec05.exam03_method_polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//인터페이스 타입을 매개변수로 지정한 메소드에 
		//다양한 구현 객체를 사용할 수 있다. 
		driver.driver(bus);
		driver.driver(taxi);

	}

}
