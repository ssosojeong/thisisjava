package sec05.exam1_anonymous_extends;

public class Anonymous {
	//Person을 부모객체로 하는 자식 객체를 익명으로 구현
	Person field = new Person() {
		//익명 객체 내에서 선언된 studentNo와 work()는 밖에서 사용 불가
		String studentNo;
		void work() {
			System.out.println("출근합니다.");
		}
		//부모 Person의 wake()를 재정의
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	
	void method1() {
		Person localVar = new Person() {
			String studentNo;
			void walk() {
				System.out.println("산책합니다.");
			}
			//부모 Person의 wake()를 재정의
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
	

}
