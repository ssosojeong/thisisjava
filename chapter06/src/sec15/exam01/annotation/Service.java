package sec15.exam01.annotation;

public class Service {
	
	@PrintAnnotation						//element 값을 주지 않았으니까 default대로 감
	public void method1() {
		System.out.println("실행 내용 1");
	}
	
	@PrintAnnotation("*")					//default 값인 value에만 값을 줌
	public void method2() {				
		System.out.println("실행 내용 2");
	}
	
	@PrintAnnotation(value="#", number=20)	//value와 number 모두에 값을 줌
	public void method3() {
		System.out.println("실행 내용 3");
	}

}
