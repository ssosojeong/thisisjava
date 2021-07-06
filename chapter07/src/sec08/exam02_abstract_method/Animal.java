package sec08.exam02_abstract_method;

public abstract class Animal {
	//필드
	public String kind;
	
	//메소드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();			//추상 메소드는 추상 클래스에서만 사용 가능

}
