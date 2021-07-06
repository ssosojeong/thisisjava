package sec03.exam03_tostring;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	//toString()을 호출하면 좀 더 의미있는 문자열을 리턴하도록 
	//object 클래스의 메소드 재정의
	@Override
	public String toString() {
		return company + ", " + os;
	}

}
