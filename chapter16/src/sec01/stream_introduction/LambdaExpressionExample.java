package sec01.stream_introduction;

import java.util.*;
import java.util.stream.*;

public class LambdaExpressionExample {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍자바", 90),
				new Student("신자바", 92)
				);
		Stream<Student> stream = list.stream();
		
		stream.forEach( s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + ": " + score); //ㅇㅇ
		});
				
		
		

	}

}
