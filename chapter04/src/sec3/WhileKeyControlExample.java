package sec3;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception{
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			//키를 누르고 엔터를 누르면 자동으로 엔터의 키코드인 10과 13도 연속해서 인식됨
			//만약 if문에서 13과 10이 아니라는 조건을 걸지 않으면 while문이 세번 실행됨
			if( keyCode!=13 && keyCode!=10 ) {
				System.out.println("-------------------------");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지 ");
				System.out.println("-------------------------");
				System.out.print("선택: ");
			}
			
			keyCode = System.in.read(); //키보드의 키 코드를 읽음
			
			if (keyCode == 49) {
				speed++; //대입과 같이 쓰지 않으므로 ++speed랑 동일
				System.out.println("현재 속도= " + speed);
			} else if (keyCode == 50) {
				speed--; //대입과 같이 쓰지 않으므로 --speed랑 동일
				System.out.println("현재 속도= " + speed);
			} else if (keyCode == 51) {
				run = false;
			}
			
		}
		
		System.out.println("프로그램 종료");

	}

}
