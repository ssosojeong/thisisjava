package sec3;

public class BreakOutterExample {
	public static void main(String[] args) {
		Outter: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
					break Outter; 
					//반복문 앞에 Outter라고 선언하고 break Outter;를 실행함으로써 바깥 반복문도 종료하게 함
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}

}
