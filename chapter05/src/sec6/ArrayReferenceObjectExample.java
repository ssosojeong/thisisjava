package sec6;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println( strArray[0] == strArray[1] ); //같은 문자열 리터럴로 선언했으므로 참조가 같음 
		System.out.println( strArray[0] == strArray[2] ); //같은 내용이지만 new 연산자로 생성했으므로 참조가 다름 
		System.out.println( strArray[0].equals(strArray[2]) ); //하지만 문자열 내용은 같음 

	}

}
