package sec07.exam02_promotion_access;

import sec07.exam01_promotion.*;

public class ChildExample {
	
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child; 			//부모 타입으로 자동 타입 변환 
		
		parent.method1();				//parent의  method1() 호출
		parent.method2();				//오버라이딩 된 child의 method2() 호출
		//parent.method3();				//parent에 없는 method3()은 호출 불가
	}

}
