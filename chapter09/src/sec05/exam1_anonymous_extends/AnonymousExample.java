package sec05.exam1_anonymous_extends;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		//익명 자식 객체를 필드 초기값으로 활용
		//Anonymous에서 재정의된 wake()가 호출
		anony.field.wake();

		//익명 자식 객체를 로컬변수 초기값으로 활용 
		anony.method1();
		
		//익명 자식 객체를 메소드 매개값으로 사용
		anony.method2(new Person() {
			String studentNo;
			void study() {
				System.out.println("공부합니다.");
			}
			//부모 Person의 wake()를 재정의
			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}
		});
	}

}
