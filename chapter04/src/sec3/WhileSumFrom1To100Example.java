package sec3;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1; //카운터 변수
		
		while(i<=100) {
			sum += i;
			i++;
		}
		
		//i가 마지막에 1 증가돼서 while문 밖으로 나오기 때문에 (i-1)이라고 해줌
		System.out.println("1~" + (i-1) + "까지의 합: " + sum);
	}

}
