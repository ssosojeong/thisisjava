package verify;

public class Exercise050607 {

	public static void main(String[] args) {
		
		//exercise04
		int value = 356;
		//연산 결과가 int형이기 때문에 100으로 나누고 다시 100 곱한 값이 300으로 나옴
		System.out.println((value/100)*100);
		
		//exercise05
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop + lengthBottom) * height / 2.0;
		System.out.println(area);
		
		//exercise06
		int x = 10;
		int y = 5;
		
		System.out.println( (x>7) && (y<=5) ); //t&&t -> t
		System.out.println( (x%3 == 2) || (y%2 != 1)); //f||f -> f

	}

}
