package verify.exam08;

import java.util.*;

public class SplitExample {
	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		
		//방법1 (split() 메소드 이용)
		String[] newStr1 = str.split(",");
		for(String s : newStr1) {
			System.out.println(s);
		}
		
		System.out.println();
		
		//방법2 (StringTokenizer 이용)
		
		StringTokenizer newStr2 = new StringTokenizer(str, ",");
		while(newStr2.hasMoreTokens()) {
			String token = newStr2.nextToken();
			System.out.println(token);
		}
		
	}

}
