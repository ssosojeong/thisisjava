package sec13.exam01_class_access.package2;

import sec13.exam01_class_access.package1.*;

public class C {
	//default 접근 제한인 class A를 다른 패키지의 class C에선 접근할 수 없음(import 해도)
	//A a;		//(x)
	
	//public 접근 제한인 class B는 패키지를 import하면 사용할 수 있음
	B b;

}
