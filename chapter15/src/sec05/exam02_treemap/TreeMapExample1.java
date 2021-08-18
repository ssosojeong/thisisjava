package sec05.exam02_treemap;

import java.util.*;

public class TreeMapExample1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(87, "홍자바");
		scores.put(98, "이자바");
		scores.put(75, "박자바");
		scores.put(95, "신자바");
		scores.put(80, "김자바");
		
		Map.Entry<Integer, String> entry = null;
		
		//가장 낮은 점수
		entry = scores.firstEntry();
		System.out.println("가장 낮은 점수: " + entry.getKey() + " - " + entry.getValue() + "\n");
		//가장 높은 점수
		entry = scores.lastEntry();
		System.out.println("가장 높은 점수: " + entry.getKey() + " - " + entry.getValue() + "\n");
		//95 바로 아래 점수(95 미포함)
		entry = scores.lowerEntry(95);
		System.out.println("95 바로 아래 점수: " + entry.getKey() + " - " + entry.getValue() + "\n");
		//95 바로 위 점수(95 미포함)
		entry = scores.higherEntry(95);
		System.out.println("95 바로 위 점수: " + entry.getKey() + " - " + entry.getValue() + "\n");
		//95 아래 점수(95 포함)
		entry = scores.floorEntry(95);
		System.out.println("95 포함 아래 점수: " + entry.getKey() + " - " + entry.getValue() + "\n");
		//95 위 점수(95 포함)
		entry = scores.ceilingEntry(95);
		System.out.println("95 포함 위 점수: " + entry.getKey() + " - " + entry.getValue() + "\n");

		//하나씩 가져오기 - poll~() 사용시 가져오면 삭제됨
		while(!scores.isEmpty()) {
			//가장 작은 값부터 뺀 뒤 삭제
			//entry = scores.pollFirstEntry();
			//가장 큰 값부터 뺀 뒤 삭제
			entry = scores.pollLastEntry();
			System.out.println(entry.getKey() + " - " + entry.getValue() + "(남은 객체 수: " + scores.size() + ")");
			
		}
	}

}
