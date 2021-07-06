package sec3;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue; //홀수인 경우 아래 코드를 실행하지 않고 조건식으로 돌아감
			}
			System.out.println(i);
		}

	}

}
