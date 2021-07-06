package sec07.exam06_casting;

public class ChildExample {
	
	public static void main(String[] args) {
		Parent parent = new Child();
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		
		//Child 객체를 생성했지만 Parent 타입으로 자동 변환됐기 때문에 사용할 수 없음 
		//parent.field2 = "data2";
		//parent.method3();
		
		Child child = (Child) parent;
		child.field2 = "data2";
		child.method3();
		
	}

}
