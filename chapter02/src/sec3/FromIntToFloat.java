package sec3;

public class FromIntToFloat {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2; //int를 float로 promotion
		num2 = (int) num3; //다시 float를 int로 casting
		
		int result = num1 - num2;
		System.out.println(result);
		//0이 나오지 않음 (정밀도 손실 때문에)
		//해결하려면 float가 아니라 double쓰기!
		//double은 가수가 52bit이므로 int의 32bit를 모두 담을 수 있음
	}
}
