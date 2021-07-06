package sec04.exam01_overriding;

public class Computer extends Calculator {
	
	//정확히 오버라이딩 됐는지 컴파일러가 확인하게 하기 위해 @Overrice 어노테이션 사용
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}

}
