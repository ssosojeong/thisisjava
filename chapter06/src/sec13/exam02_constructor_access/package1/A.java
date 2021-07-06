package sec13.exam02_constructor_access.package1;

public class A {
	
	//자기 자신의 클래스이기 때문에 public, default, private 생성자 모두 호출 가능
	A a1 = new A(true);
	A a2 = new A();
	A a3 = new A("문자열");
	
	//public 접근 제한을 갖는 생성자
	public A(boolean b) {}
	
	//default 접근 제한을 갖는 생성자
	A(){}
	
	//private 접근 제한을 갖는 생성자
	private A(String s) {}

}
