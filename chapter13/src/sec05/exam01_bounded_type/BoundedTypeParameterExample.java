package sec05.exam01_bounded_type;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {
		
		//잘못된 코드 -> compare는 Number의 자식을 받기 때문에
		//				스트링이 매개변수로 올 수 없음 
		//int result1 = Util.compare("a", "b");
		
		int result1 = Util.compare(10,20);
		System.out.println(result1);
		
		int result2 = Util.compare(4.5, 3);
		System.out.println(result2);

	}

}
