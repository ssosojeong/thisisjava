package sec03.stream_pipelines;

import java.util.*;

public class StreamPipelinesExample {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", Member.MALE, 30),
				new Member("김나리", Member.FEMALE, 20),
				new Member("신자바", Member.MALE, 45),
				new Member("박자바", Member.FEMALE, 27)			
		);
		
		double ageAvg = list.stream()
							.filter( m -> m.getSex()==Member.MALE)
							.mapToInt( Member :: getAge )
							.average()
							.getAsDouble();
		
		System.out.println("남자 평균 나이: " + ageAvg);

		
	}

}
