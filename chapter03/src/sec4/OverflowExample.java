package sec4;

public class OverflowExample {
	public static void main(String[] args) {
		int x1 = 1000000;
		int y1 = 1000000;
		int z1 = x1 * y1;
		System.out.println(z1); //-> 에러는 안뜨지만 int 범위 넘으므로 garbage value 나옴 
		
		
		//해결하려면 피연산자 중 하나 이상을 long으로 선언하고, 결과 변수를 long으로 선언해야 함
		long x2 = 1000000;
		long y2 = 1000000;
		long z2 = x2 * y2;
		System.out.println(z2);
		
		//아니면 연산식에서 casting 하던지
		int x3 = 1000000;
		int y3 = 1000000;
		long z3 = (long) x3 * y3;
		System.out.println(z3);
	}

}
