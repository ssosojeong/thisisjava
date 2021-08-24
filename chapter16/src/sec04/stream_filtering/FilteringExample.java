package sec04.stream_filtering;

import java.util.*;

public class FilteringExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동","신용권","김자바","신용권","신민철");
		
		//distinct()
		names.stream()
				.distinct()
				.forEach( System.out :: println );
		System.out.println();
		
		//filter()
		names.stream()
				.filter(n -> n.startsWith("신"))
				.forEach( System.out :: println );
		System.out.println();
		
		//distinct + filter
		names.stream()
				.distinct()
				.filter(n -> n.startsWith("신"))
				.forEach( System.out :: println );

	
	}

}
