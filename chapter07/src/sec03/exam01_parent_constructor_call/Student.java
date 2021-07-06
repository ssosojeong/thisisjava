package sec03.exam01_parent_constructor_call;

public class Student extends People {
	//부 people 클래스에 기본 생성자가 없기 때문에 오류 발생 
	//-> 자식에서 생성자를 따로 super()로 호출해서 만들어줘야 함 
	public int studentNo;

	public Student(String name, String ssn, int studentNo) {
		//this.studentNo = studentNo;		//항상 super()가 맨 윗줄에 있어야 함 
		super(name, ssn);
		this.studentNo = studentNo;
		System.out.println("자식 객체 생성 완료");
	}
	
}
