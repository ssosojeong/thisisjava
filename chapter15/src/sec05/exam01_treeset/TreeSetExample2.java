package sec05.exam01_treeset;

import java.util.*;

public class TreeSetExample2 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		//내림차순 정렬
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		for(int score: descendingSet) {
			System.out.print(score + " ");
		}
		System.out.println();

		//오름차순 정렬은 따로 메소드가 없기 때문ㅇ
		//descendingSet에 한번 더 정렬시켜줌
		NavigableSet<Integer> asendingSet = descendingSet.descendingSet();
		for(int score: asendingSet) {
			System.out.print(score + " ");
		}
		System.out.println();
		
		
		
		
		
	}

}
