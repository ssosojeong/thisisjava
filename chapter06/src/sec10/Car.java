package sec10;

public class Car {
	//static 쓸 때 주의할 점
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		
		//아무리 같은 클래스여도 static인 main 메소드 내부에서 인스턴스 멤버 사용할 수 없음
		//speed = 60;
		//run();
		
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}

}
