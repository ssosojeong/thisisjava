package sec10;

public class Singleton {
	//private 정적 필드로 자기 자신 객체를 딱 하나 생성함 
	private static Singleton singleton = new Singleton();
	
	//생성자를 private로 선언 -> 외부에서 객체 생성 안되게 
	private Singleton() {
	}
	
	//외부에서 유일하게 접근할 수 있는
	//정적 멤버로 만들어진 단 하나의 객체를 리턴하는 getInstance()메소드
	//관례적으로 이름을 getInstance라고 지음 
	static Singleton getInstance() {
		return singleton;
	}
	

}
