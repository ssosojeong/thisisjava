package sec3;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2; -> 컴파일 에러(연산식 결과는 int이므로)
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2; -> 컴파일 에러(연산식 결과는 int이므로)
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char)intValue2); //유니코드를 문자로 출력하려면 (char)로 캐스팅 필요
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0 -> 컴파일 에러(실수로 나누니까 연산식 결과가 실수형으로 리턴됨)
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
	}

}
