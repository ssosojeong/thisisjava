package sec07.exam02_promotion_access;

import sec07.exam01_promotion.*;

public class Child extends Parent{

	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	
	public void method3() {
		System.out.println("Child-method3()");
	}
	
	 

}
