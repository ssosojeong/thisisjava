package sec3;

public class BreakExample {
	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			System.out.println(num);
			if(num==6) {
				break; //주사위에서 6이 뽑히면 break문으로 가장 가까운 반복문이 중지
			}			
		}
		System.out.println("프로그램 종료");
	}

}
