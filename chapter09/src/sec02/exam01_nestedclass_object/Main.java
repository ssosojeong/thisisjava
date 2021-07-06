package sec02.exam01_nestedclass_object;

import sec02.exam01_nestedclass_object.A.*;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		
		//인스턴스 멤버 클래스
		//A객체를 만든 뒤 그걸 통해 접근 가능 
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		//정적 멤버 클래스
		A.C c = new A.C();
		//객체를 생성해 인스턴스 멤버에 접근 가능
		c.field1 = 3;
		c.method1();
		//정적 멤버는 객체가 아닌 클래스 자체로 접근 가능
		A.C.field2 = 3;
		A.C.method2();
		
		//로컬 클래스인 D를 외부에서 직접 사용은 안됨
		a.method();

	}

}
