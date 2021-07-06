package sec2;

public class CharExample {
	public static void main(String[] args) {
		char c1 = 'A';		//문자를 직접 저장 
		char c2 = 65;		//10진수로 저장 
		char c3 = '\u0041'; //16진수로 저장
		
		char c4 = '가';		//문자를 직접 저장
		char c5 = 44032;	//10진수로 저장 
		char c6 = '\uac00'; //16진수로 저장 
		
		int uniCode = c1;	//유니코드 얻기 
		
		//char는 어떤 방식으로 저장해도 출력은 문자로 됨 
		System.out.println(c1);  
		System.out.println(c2); 
		System.out.println(c3); 
		System.out.println(c4); 
		System.out.println(c5); 
		System.out.println(c6); 
		
		//유니코드 값을 얻으려면 int 변수에 저장해줘야 함 
		System.out.println(uniCode);
		
	}

}
