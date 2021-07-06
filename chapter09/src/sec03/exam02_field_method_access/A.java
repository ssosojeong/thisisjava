package sec03.exam02_field_method_access;

public class A {
	int field1;
	void method1() {}

	static int field2;
	static void method2() {}
	
	//인스턴스 멤버 클래스
	class B{
		void method() {
			//인스턴스, 정적 다 사용 가능
			field1 = 3;
			method1();
			
			field2 = 3;
			method2();
		}
	}
	
	//정적 멤버 클래스
	static class C{
		void method() {
			//인스턴스 사용 불가
			//field1 = 3;
			//method1();
			
			//정적은 사용 가능
			field2 = 3;
			method2();
		}
	}
}
