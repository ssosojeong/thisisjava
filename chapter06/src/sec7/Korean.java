package sec7;

public class Korean {
	
	//필드
	//nation은 필드 선언 단계에서 초기화 -> 모든 객체가 같은 값을 갖게됨 
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자
	//나머지는 생성자를 통해 필드 초기화 -> 각 개체가 다른 값을 갖게됨
	public Korean(String n, String s) {
		name = n;
		ssn = s;
	}

}
