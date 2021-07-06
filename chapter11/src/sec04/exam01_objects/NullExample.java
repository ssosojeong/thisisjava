package sec04.exam01_objects;

import java.util.*;

public class NullExample {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		//Objects.requireNonNull()
		System.out.println(Objects.requireNonNull(str1));
		
		try {
		System.out.println(Objects.requireNonNull(str2));
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		//좀 더 의미있는 오류 메세지
		try {
		System.out.println(Objects.requireNonNull(str2, "이름이 없습니다."));
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		//람다식 사용
		try {
		System.out.println(Objects.requireNonNull(str2, ()->"이름이 없습니다."));
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		//Objects.isNull()
		System.out.println(Objects.isNull(str1));
		System.out.println(Objects.isNull(str2));
		
		System.out.println();
		//Objects.nonNull()
		System.out.println(Objects.nonNull(str1));
		System.out.println(Objects.nonNull(str2));

	}

}
