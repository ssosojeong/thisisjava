package sec11.stream_collect;

import java.util.*;
import java.util.stream.*;

public class ToListExample {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍자바", 10, Student.Sex.MALE),
				new Student("김자바", 6, Student.Sex.FEMALE),
				new Student("신자바", 10, Student.Sex.MALE),
				new Student("박자바", 6, Student.Sex.FEMALE)
		);
		
		//남학생들만 묶어 리스트로 생성
		List<Student> maleList = totalList.stream()
											.filter(s-> s.getSex()==Student.Sex.MALE)
											.collect(Collectors.toList());
		maleList.stream().forEach(s-> System.out.println(s.getName()));
		
		
		//여학생들만 묶어 해시셋 생성
		Set<Student> femaleSet = totalList.stream()
											.filter(s-> s.getSex()==Student.Sex.FEMALE)
											.collect(Collectors.toCollection(HashSet :: new));
		femaleSet.stream().forEach(s-> System.out.println(s.getName()));					
		
		
	}

}
