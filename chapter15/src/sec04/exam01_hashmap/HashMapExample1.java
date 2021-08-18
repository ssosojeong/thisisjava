package sec04.exam01_hashmap;

import java.util.*;

public class HashMapExample1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("김자바", 85);
		map.put("이자바", 90);
		map.put("박자바", 80);
		map.put("이자바", 95);  //키가 겹치므로 이자바에 대한 value는 95로 대치
		
		System.out.println("총 엔트리 수: " + map.size());
		System.out.println("이자바: " + map.get("이자바"));
		System.out.println();
		
		//keySet을 이용한 전체 개체 조회
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + ": " + value);
		}
		System.out.println();
		
		map.remove("이자바");
		System.out.println("총 엔트리 수: " + map.size());
		
		//entrySet을 이용한 전체 개체 조회
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + ": " + value);
		}

		System.out.println();
		map.clear();
		System.out.println("총 엔트리 수: " + map.size());
		
		
		
		

	}

}
