package sec13.exam02_constructor_access.package2;

import sec13.exam02_constructor_access.package1.*;

public class C {
	
	//다른 패키지여도 public 생성자는 호출 가능 
	A a1 = new A(true);
	
	//default, private는 불가 
	//A a2 = new A(); 			//(X)
	//A a3 = new A("문자열"); 	//(X)

}
