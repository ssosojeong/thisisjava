package sec10.exam01_pattern_match;

import java.util.regex.*;

public class PatternExample {

	public static void main(String[] args) {
		
		//전화번호 비교
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		
		boolean result = Pattern.matches(regExp, data);
		if(result = true) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		//이메일 비교
		regExp = "\\w+@\\w+\\.+\\w+(\\.\\w+)?";
		data = "angel@naver.com";
		
		result = Pattern.matches(regExp, data);
		if(result = true) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}

	}

}
