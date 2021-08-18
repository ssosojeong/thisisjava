package sec05.exam01_treeset;

import java.util.*;

public class TreeSetExample3 {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");
		
		//c~f사이의 단어 가져오기
		//forever은 fo이기 때문에 사전상 f보다 뒤에있음 -> 미포함
		System.out.println("[c~f 사이의 단어 검색]");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
		for(String word : rangeSet) {
			System.out.println(word);
		}

	}

}
