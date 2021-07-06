package sec07.exam05_method_polymorphism;

public class DriverExample {
	
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//원래 drive()의 매개변수는 Vehicle 타입인데
		//Vehicle 클래스를 상속받은 Bus와 taxi 타입도 매개변수로 사용 가능
		//-> 매개변수의 다형성
		//그러면 drive()에서는 vehicle.run()을 호출할 때 
		//매개변수로 들어온 자식 클래스 bus와 taxi에서 오버라이딩 된 run()을 호출함
		driver.drive(bus);
		driver.drive(taxi);
		
	}

}
