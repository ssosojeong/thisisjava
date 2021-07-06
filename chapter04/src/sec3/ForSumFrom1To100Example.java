package sec3;

public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1~100 합: " + sum);
		//System.out.println("1~" + i-1 + "100 합: " + sum);
		//-> 얘는 오류 발생 (int i는 for문 안에서 선언됐으므로 밖에서 사용할 수 없음)
		//-> i-1이라고 하는 이유: i=100일 때 실행되고 증가돼서 i는 현재 101임
	}

}
