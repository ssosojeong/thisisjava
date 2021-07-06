package sec3;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
			//부동소수점 형식이라서 10번 반복도 안되고 애초에 숫자가 이상해짐
		}

	}

}
