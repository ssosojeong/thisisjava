package sec06.exam01_protected_package2;

import sec06.exam01_protected_package1.*;

public class D extends A{
	
	public D() {
		super();				//D는 A를 상속받았으니 사용할 수 있음
		this.field = "value";
		this.method();
	}
	
	void method1() {			//생성자 말고 그냥 메소드에서도 사용 가능
		this.field = "상속";
		this.method();
	}

}
