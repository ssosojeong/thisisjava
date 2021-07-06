package sec13.exam03_field_method_access.package1;

public class B {
	
	public B() {
		A a = new A();
		
		a.field1 = 1;		//public 접근 제한 -> 동일 패키지 다른 클래스 사용 가능
		a.field2 = 1;		//default 접근 제한 -> 동일 패키지 다른 클래스 사용 가능
		//a.field3 = 1;		//private 접근 제한 -> 동일 패키지 다른 클래스 사용 불가능
		
		a.method1();		//public 접근 제한 -> 동일 패키지 다른 클래스 사용 가능
		a.method2();		//default 접근 제한 -> 동일 패키지 다른 클래스 사용 가능
		//a.method3();		//private 접근 제한 -> 동일 패키지 다른 클래스 사용 불가능
	
	}

}
