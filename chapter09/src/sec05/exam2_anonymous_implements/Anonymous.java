package sec05.exam2_anonymous_implements;

public class Anonymous {
	
	//필드 초기값으로 익명 구현 객체 활용
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
		
	};
	
	//로컬 변수로 익명 구현 객체 활용
	void method1() {
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
			
		};
		localVar.turnOn();
		localVar.turnOff();
	}
	
	//메소드 매개변수로 익명 구현 객체 활용
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
