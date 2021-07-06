package sec10;

public class CalculatorExample {

	public static void main(String[] args) {
		
		//반지름이 10이 원의 둘레를 구하기 
		//pi는 정적 멤버이기 때문에 클래스 이름으로 접근 
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);

	}

}
