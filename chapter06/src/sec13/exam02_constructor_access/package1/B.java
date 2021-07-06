package sec13.exam02_constructor_access.package1;

public class B {
	
	//같은 패키지이기 때문에 public, default 생성자는 모두 호출 가능
	A a1 = new A(true);
	A a2 = new A();
	
	//같은 패키지여도 private 생성자는 호출 불가
	//A a3 = new A("문자열"); 	//(X)

}
