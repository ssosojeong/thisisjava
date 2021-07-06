package sec5;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 85;
		//삼항 연산자 안에 삼항 연산자를 넣음 
		char grade = (score>90) ? 'A' : ((score>80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");

	}

}
