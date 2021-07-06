package sec05.exam05_instanceof;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
	
		//Bus 객체를 넣게 되면 bus.checkFare() 호출한 뒤 run()
		driver.driver(bus);
		//그 외는 run()만
		driver.driver(taxi);

	}

}
