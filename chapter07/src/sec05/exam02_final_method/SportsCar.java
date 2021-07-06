package sec05.exam02_final_method;

public class SportsCar extends Car{
	
	//speedUp 메소드 오버라이드
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	//stop 메소드는 final 메소드라 재정의할 수 없음
	/*
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
	*/
	
}
