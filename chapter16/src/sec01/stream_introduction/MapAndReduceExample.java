package sec01.stream_introduction;

import java.util.*;

public class MapAndReduceExample {
	
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍자바", 10),
				new Student("신자바", 20),
				new Student("유자바", 30)
			);
		
		double avg = studentList.stream()
				.mapToInt(Student :: getScore)
				.average()
				.getAsDouble();			
				
				
		
		
	}

}
