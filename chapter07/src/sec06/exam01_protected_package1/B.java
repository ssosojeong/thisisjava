package sec06.exam01_protected_package1;

public class B {
	
	public void method() {
		A a = new A();			//A의 생성자는 protected로, 같은 패키지인 B는 호출 가능
		a.field = "value";		//동일
		a.method();				//동일
	}

}
