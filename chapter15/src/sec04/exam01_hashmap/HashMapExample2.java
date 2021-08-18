package sec04.exam01_hashmap;

import java.util.*;

public class HashMapExample2 {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		
		//Student의 equals와 hashcode를 재정의하였기 때문에
		//키값인 두 Student 객체는 동등객체로 판단되어 
		//해당 key에 대해 첫번째 value는 두번째 value로 대치됨 
		map.put(new Student(1, "홍자바"), 95);
		map.put(new Student(1, "홍자바"), 90);
		
		System.out.println("총 엔트리 수: " + map.size());
		
		System.out.println(map.get(new Student(1, "홍자바")));

	}

}
