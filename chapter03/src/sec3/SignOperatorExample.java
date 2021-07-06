package sec3;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
	
		short s = 100;
		//short result3 = -s; -> 컴파일 에러 (연산 결과는 int형)
		int result3 = -s;
		short result4 = (short) -s; //굳이 short형 하고싶으면 캐스팅 해야 함 
		System.out.println("result3=" + result3);
		System.out.println("result4=" + result4);
	
	}

}
