package sec07.exam02_method;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		System.out.println(str1.equals(str2));	//false
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));	//true
		
		//대소문자 무시하고 내용물 비교하는 equalsIgnoreCase()
		System.out.println(str1.equalsIgnoreCase(str2));	//true
		

	}

}
