package sec03.exam01_hashset;

import java.util.*;

public class HashSetExample1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); 		//중복 저장 안됨
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체 수: " + size);
		
		//반복자를 활용한 객체 가져오기
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		System.out.println("총 객체 수: " + set.size());
		
		//향상된 for문 활용한 객체 가져오기
		for(String element : set) {
			System.out.println("\t" + element);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}

	}

}
