package sec07.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;		//B는 A를 상속받음 -> A타입 변수에 저장 가능 
		A a2 = c;		//C는 A를 상속받음 -> A타입 변수에 저장 가능 
		A a3 = d;		//D는 A를 상속받음 -> A타입 변수에 저장 가능 
		A a4 = e;		//E는 A를 상속받음 -> A타입 변수에 저장 가능 
		
		B b1 = d;		//D는 B를 상속받음 -> B타입 변수에 저장 가능 
		C c1 = e;		//E는 C를 상속받음 -> C타입 변수에 저장 가능 

		//B b2 = e;		//E는 B를 상속받지 않음 -> B타입 변수에 저장 불가능 
		//C c2 = d; 		//D는 C를 상속받지 않음 -> C타입 변수에 저장 불가능 
	}

}
