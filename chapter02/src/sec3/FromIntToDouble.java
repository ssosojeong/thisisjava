package sec3;

public class FromIntToDouble {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2; //int를 double로 promotion
		num2 = (int) num3; //다시 double을 int로 casting
		
		int result = num1 - num2;
		System.out.println(result);

	}

}
