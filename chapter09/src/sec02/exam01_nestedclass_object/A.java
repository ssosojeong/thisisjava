package sec02.exam01_nestedclass_object;

public class A {
	//생성자
	A(){
		System.out.println("A객체가 생성됨");
		//A내부에서는 중첩 인스턴스 멤버 클래스 B를 자유롭게 사용 가능
		/*B b = new B();
		b.field1 = 3;
		b.method1();
		*/
	}
	
	/**인스턴스 멤버 클래스**/
	class B{
		//필드
		//인스턴스 필드
		int field1;
		
		//인스턴스 멤버 클래스 내 스태틱 필드 생성 불가
		//static int field2;
		
		//생성자
		B(){
			System.out.println("B객체가 생성됨");
		}
		
		//메소드
		//인스턴스 메소드
		void method1() {}
		
		//인스턴스 멤버 클래스 내 스태틱 메소드 생성 불가
		//static void method2() {};
	}
	
	/**정적 멤버 클래스**/
	static class C{
		//필드
		//정적 멤버 클래스는 인스턴스와 스태틱 필드 둘 다 가능
		int field1;
		static int field2;
		
		//생성자
		C(){
			System.out.println("C객체가 생성됨");
		}
		
		//메소드
		//정적 멤버 클래스는 인스턴스와 스태틱 메소드 둘 다 가능
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		/**로컬 클래스**/
		class D{
			//필드
			//인스턴스 필드
			int field1;
			
			//로컬 클래스 내 스태틱 필드 생성 불가
			//static int field2;	
		
			//생성자
			D(){
				System.out.println("D객체가 생성됨");
			}
			
			//메소드
			//인스턴스 메소드
			void method1() {}
			
			//로컬 클래스 내 스태틱 메소드 생성 불가
			//static void method2() {};			
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
	
}
