package sec05.exam01_treeset;

import java.util.*;

public class TreeSetExample1 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		Integer score = null;
		
		//가장 왼쪽에 있는(=가장 작은) 값
		score = scores.first();
		System.out.println("가장 작은 값(first): " + score);
		//가장 오른쪽에 있는(=가장 큰) 값
		score = scores.last();
		System.out.println("가장 큰 값(last): " + score + "\n");
		
		//95점 바로 아래 값
		score = scores.lower(95);
		System.out.println("95 바로 아래에 있는 값(lower): " + score);
		//95점 바로 위 값
		score = scores.higher(95);
		System.out.println("95 바로 위에 있는 값(higher): " + score);
		//95 또는 95점 바로 아래 값
		score = scores.floor(95);
		System.out.println("95 또는 95 바로 아래에 있는 값(floor): " + score);
		//85 또는 85점 바로 위 값
		score = scores.ceiling(85);
		System.out.println("85 또는 85 바로 위에 있는 값(floor): " + score + "\n");

		//하나씩 가져오기 - poll~() 사용시 가져오면 삭제됨
		while(!scores.isEmpty()) {
			//가장 작은 값부터 뺀 뒤 삭제
			score = scores.pollFirst();
			//가장 큰 값부터 뺀 뒤 삭제
			//score = scores.pollLast();
			System.out.println(score + "(남은 객체 수: " + scores.size() + ")");
		}
		
		//하나씩 가져오기 - Iterator 사용시 가져오기만 함
		//line 49처럼 remove()를 사용할 경우 poll~()처럼 삭제 가능
		Iterator<Integer> iterator = scores.iterator();
		while(iterator.hasNext()) {
			int s = iterator.next();
			//iterator.remove(); 
			System.out.println(s);
		}
		
		
		
	}

}
