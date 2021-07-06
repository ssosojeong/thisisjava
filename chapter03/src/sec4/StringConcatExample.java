package sec4;

public class StringConcatExample {

	public static void main(String[] args) {
		
		//string과 다른 타입 변수를 +하면 
		//다른 타입 변수가 string으로 변한 뒤 연결됨  
		String str1 = "JDK" + 6.0;
		String str2 = str1 + "특징";
		System.out.println(str2);
		
		//하지만 문자열 연결 연산자도 순서를 따짐 
		String str3 = "JDK" + 3 + 3.0; //JDK부터 문자열로 합쳐짐 
		String str4 = 3 + 3.0 + "JDK"; //3+3.0은 double로 덧셈된 뒤 문제열로 합쳐짐 
		System.out.println(str3);
		System.out.println(str4);
		

	}

}
