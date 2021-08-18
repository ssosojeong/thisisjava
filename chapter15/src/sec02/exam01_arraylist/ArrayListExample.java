package sec02.exam01_arraylist;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database"); //2번에 저장됐던 Servlet/JSP가 3번 인덱스로 이동
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("총 객체 수: " + size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2: "+skill);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + ": " + list.get(i));
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + ": " + list.get(i));
		}
		System.out.println();
		
		

	}

}
