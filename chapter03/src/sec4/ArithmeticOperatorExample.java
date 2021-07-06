package sec4;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1 = " + result1);
		
		int result2 = v1 - v2;
		System.out.println("result2 = " + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3 = " + result3);
		
		int result4 = v1 / v2; //연산 결과가 int고 산출 변수도 int로 선언됐으므로 결과가 2
		System.out.println("result4 = " + result4);
		
		int result5 = v1 % v2;
		System.out.println("result5 = " + result5);
		
		//실수 결과를 얻기 위해 피연산자 하나 이상을 double로 캐스팅 & 산출 변수도 double로 선언 
		double result6 = (double) v1 / v2; 
		System.out.println("result6 = " + result6);

	}

}
