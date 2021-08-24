package sec05.stream_mapping;

import java.util.*;

public class FlatMapExample {

	public static void main(String[] args) {
		List<String> inputList1 = Arrays.asList("java8 lambda", "stream mapping");
		
		inputList1.stream()
					.flatMap(data-> Arrays.stream(data.split(" ")))
					.forEach(System.out :: println);
		
		
		
		
		
	}

}
