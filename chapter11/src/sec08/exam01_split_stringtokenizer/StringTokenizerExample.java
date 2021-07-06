package sec08.exam01_split_stringtokenizer;

import java.util.*;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";
		
		//1번 방법: 전체 토큰 수를 얻어 for문으로 루핑
		StringTokenizer st1 = new StringTokenizer(text, "/");
		int countTokens = st1.countTokens();
		
		for(int i=0; i<countTokens; i++) {
			String token = st1.nextToken();
			System.out.println(token);
		}
		
		System.out.println();
		
		StringTokenizer st2 = new StringTokenizer(text, "/");
		//2벙 방법: 남아 있는 토큰을 확인하고 while문으로 루핑 -> 일반적 
		while(st2.hasMoreTokens()) {
			String token = st2.nextToken();
			System.out.println(token);
		}
		
		
		

	}

}
