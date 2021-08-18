package sec05.exam02_treemap;

import java.util.*;

public class TreeMapExample2 {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(87, "홍자바");
		scores.put(98, "이자바");
		scores.put(75, "박자바");
		scores.put(95, "신자바");
		scores.put(80, "김자바");

		//내림차순
		NavigableMap<Integer, String> descendingMap = scores.descendingMap();
		Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();
		
		for(Map.Entry<Integer, String> entry : descendingEntrySet){
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}
		System.out.println();

		//오름차순(descendingMap 2번)
		NavigableMap<Integer, String> asendingMap = descendingMap.descendingMap();
		Set<Map.Entry<Integer, String>> asendingEntrySet = asendingMap.entrySet();
		
		for(Map.Entry<Integer, String> entry : asendingEntrySet){
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}
		System.out.println();
		
	}

}
