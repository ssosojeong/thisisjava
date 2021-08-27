package sec11.stream_collect;

import java.util.*;

public class MaleStudentExample {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍자바", 10, Student.Sex.MALE),
				new Student("김자바", 6, Student.Sex.FEMALE),
				new Student("신자바", 10, Student.Sex.MALE),
				new Student("박자바", 6, Student.Sex.FEMALE)
		);
		
		MaleStudent maleStudent = totalList.stream()
									.filter(s-> s.getSex()==Student.Sex.MALE)
									.collect(
											() -> new MaleStudent(),
											(r, t) -> r.accumulate(t),
											(r1, r2) -> r1.combine(r2)
											);
		maleStudent.getList()
						.stream()
						.forEach(s-> System.out.println(s.getName()));

	}

}
