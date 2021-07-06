package sec07.exam01_why_default_method;

public interface MyInterface {
	
	public void method1();
	
	//만약 여기에 추상 메소드 method2()를 추가하면 
	//얘를 구현했던 MyClassA에서 바로 컴파일 오류 
	//public void method2();
	
	//디폴트 메소드로 추가하면 MyClassA는 더이상 오류 발생은 안함
	//하지만 이후 만들어지는 구현 클래스는 얘를 재정의해서 사용할 수 있음
	public default void method2() {
		System.out.println("MyInterface - method2 실행");
	}
}
