package sec06.stream_sorting;

import java.util.*;
import java.util.stream.*;
import java.util.Comparator;

public class SortingExample {

	public static void main(String[] args) {
		IntStream intStream = Arrays.stream(new int[] {5,4,2,1,4}); 
		intStream.sorted()
					.forEach(System.out::println);
		System.out.println();
		
		List<Student> studentList = Arrays.asList(
				new Student("홍자바", 30),
				new Student("신자바", 10),
				new Student("유자바", 20)
			);
		
		studentList.stream()
						.sorted()
						.forEach(s-> System.out.println(s.getScore()));
		System.out.println();
		
		studentList.stream()
				.sorted(Comparator.reverseOrder())
				.forEach(s-> System.out.println(s.getScore()));
	}

}
