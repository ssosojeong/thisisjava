package sec05.exam04_casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		//Vehicle 인터페이스 타입으로 선언했기 때문에
		//Vehicle에 있는 run()만 호출 가능함
		//Bus에 정의된 checkFare() 호출하려면 강제타입변환 해야함
		vehicle.run();
		//vehicle.checkFare();
		
		Bus bus = (Bus) vehicle;
		bus.checkFare();
		
	}

}
