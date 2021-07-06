package sec4;

public class StringEqualsExample {

	public static void main(String[] args) {
		//strVar1과 strVar2는 같은 객체를 참조하지만
		//new 생성자로 선언한 strVar3은 다른 객체를 참조함 
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");
		
		//같은 객체를 참조하는 strVar1과 strVar2는 ==로 비교 가능하지만
		//strVar3는 ==로 비교하면 false 뜸 
		System.out.println( strVar1 == strVar2 );
		System.out.println( strVar1 == strVar3 );
		System.out.println();
		
		//이럴 땐 equals() 메소드 사용 필요 
		System.out.println( strVar1.equals(strVar2));
		System.out.println( strVar1.equals(strVar3));
		
		
		
				

	}

}
