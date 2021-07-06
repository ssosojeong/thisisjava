package sec04.exam02_super;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeOff(); 
		//자식에서 오버라이딩된 fly 실행 -> 현재 flyMode는 NORMAL이니까 super.fly() 
		sa.fly(); 		 
		
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		//자식에서 오버라이딩된 fly 실행 -> 현재 flyMode는 SUPERSONIC 이니까 재정의된 fly() 
		sa.fly();
		
		sa.flyMode = SupersonicAirplane.NORMAL;
		//자식에서 오버라이딩된 fly 실행 -> 현재 flyMode는 NORMAL이니까 super.fly() 
		sa.fly();
		
		sa.land();
	}

}
