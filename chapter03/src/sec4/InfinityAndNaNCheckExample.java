package sec4;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		// /와 % 연산에서 0으로 나누면 아예 오류가 생기지만 실수로 나누면 오류가 안뜸
		
		// 대신 / 연산에서 0.0으로 나눌 경우 Infinity 발생 
		double z1 = x / y; 
		System.out.println(Double.isInfinite(z1)); //-> T
		System.out.println(Double.isNaN(z1)); //-> F

		// 대신 % 연산에서 0.0으로 나눌 경우 NaN 발생 
		double z2 = x % y; 
		System.out.println(Double.isInfinite(z2)); // -> F
		System.out.println(Double.isNaN(z2)); //T
		
		//만약 변수가 infinity 또는 NaN인 상태에서 그 변수를 가지고 연산하면 
		//연산 결과는 무조건 infinity 또는 NaN가 나옴
		System.out.println(z1+2); // z1이 infinity -> 연산결과도 동일 
		System.out.println(z2+2); // z2이 nan -> 연산결과도 동일 

	}

}
