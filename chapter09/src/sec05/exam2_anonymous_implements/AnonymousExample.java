package sec05.exam2_anonymous_implements;

public class AnonymousExample {

	public static void main(String[] args) {
		
		//필드 초기값으로 익명 구현 객체 활용
		Anonymous anony = new Anonymous();
		
		anony.field.turnOn();
		anony.field.turnOff();
		
		//로컬 변수로 익명 구현 객체 활용
		anony.method1();
		
		//메소드 매개변수로 익명 구현 객체 활용
		anony.method2(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("SmartTV를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("SmartTV를 끕니다.");
			}
		});

	}

}
