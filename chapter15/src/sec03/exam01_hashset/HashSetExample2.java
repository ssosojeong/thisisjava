package sec03.exam01_hashset;

import java.util.*;

public class HashSetExample2 {
	
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
//		아래 두개는 개별적으로 생성했기 때문에 동일 객체는 아님
//		하지만 이름과 나이가 같기 때문에
//		재정의한 hashCode()와 equals()에 의해 동등 객체임
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		System.out.println("총 객체 수: " + set.size());
		
	}

}
