package verify.exam05;

import java.util.*;

public class StreamExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expressions",
				"Java8 supports lambda expressions"
				);
		
		list.stream()
				.filter(s-> s.toLowerCase().contains("java"))
				.forEach(a-> System.out.println(a));

	}

}
