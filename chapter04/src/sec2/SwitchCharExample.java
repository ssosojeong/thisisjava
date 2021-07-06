package sec2;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		//대문자 A와 소문자 a의 처리를 같게 하기 위해 실행문과 break를 의도적으로 사용하지 않는 방식을 활용함 
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
		}

	}

}
