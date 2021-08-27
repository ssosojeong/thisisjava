package sec05.stream_mapping;

import java.util.*;

import sec02.stream_kind.Student;

public class MapExample {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍자바", 10),
				new Student("신자바", 20),
				new Student("유자바", 30)
			);
		
		studentList.stream()
						.mapToInt(Student :: getScore)
						.forEach(System.out::println);

	}

}
