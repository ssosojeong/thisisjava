package sec05.exam06_predicate;

import java.util.*;
import java.util.function.*;

public class PredicateExample {
	private static List<Student> list = Arrays.asList(
			new Student("이제노", "남자", 90),
			new Student("나재민", "남자", 95),
			new Student("김소정", "여자", 50),
			new Student("김자바", "여자", 72)
		);
	
	public static double avg(Predicate<Student> predicate) {
		int count =0, sum = 0;
		for(Student student:list) {
			if(predicate.test(student)) {
				count ++;
				sum += student.getScore();
			}
		}
		return (double)sum/count;
	}
	
	public static void main(String[] args) {
		//남자 평균 점수
		double maleAvg = avg((t) -> t.getSex().equals("남자"));
		System.out.println("남자 평균 점수: " + maleAvg);
		
		//여자 평균 점수
		double femaleAvg = avg((t) -> t.getSex().equals("여자"));
		System.out.println("여자 평균 점수: " + femaleAvg);

	}

}
