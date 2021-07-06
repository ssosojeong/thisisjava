package sec11;

public class Person {
	final String nation = "Korea"; //Korea에서 더이상 값 수정 불가능
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;				//여기서 받은 ssn에서 더이상 값 수정 불가능
		this.name = name;
		
		//nation = "America";
		//이미 필드 선언할 때 값을 줬기 때문에 final인 nation은 값 수정 불가능
	}

}
