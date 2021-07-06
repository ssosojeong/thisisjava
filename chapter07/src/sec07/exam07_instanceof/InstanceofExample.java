package sec07.exam07_instanceof;

public class InstanceofExample {
	
	public static void method1(Parent parent) {
		if(parent instanceof Child) {			//매개변수로 받은 parent가 Child 객체를 참조하는 게 맞으면 
			Child child = (Child) parent;		//타입 변환 
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;		//타입 변환 
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		//method2(parentB);			//ClassCastException 오류 발생
		
	}

}
