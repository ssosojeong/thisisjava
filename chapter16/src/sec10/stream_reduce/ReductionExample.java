package sec10.stream_reduce;

import java.util.*;

import sec01.stream_introduction.Student;

public class ReductionExample {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
					new Student("홍자바", 92),
					new Student("신자바", 95),
					new Student("유자바", 88)
				);
		
		int sum1 = studentList.stream()
								.mapToInt(Student :: getScore)
								.sum();
		
		int sum2 = studentList.stream()
								.mapToInt(Student :: getScore)
								.reduce((a,b) -> a+b)
								.getAsInt();
		
		int sum3 = studentList.stream()
								.mapToInt(Student :: getScore)
								.reduce(0,(a,b) -> a+b);
		
		System.out.println("sum1: " + sum1);
		System.out.println("sum2: " + sum2);
		System.out.println("sum3: " + sum3);
								
		
		

	}

}
