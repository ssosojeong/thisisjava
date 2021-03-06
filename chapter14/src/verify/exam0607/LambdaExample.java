package verify.exam0607;

import java.util.function.*;

public class LambdaExample {
	private static Student[] students = {
			new Student("홍길동", 90, 96),
			new Student("김자바", 95, 93)
	};
	
	//avg 메소드 작성
	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for(Student student : students) {
			sum += function.applyAsInt(student);
		}
		return (double)sum / students.length;
	}

	public static void main(String[] args) {
		//exam06
		double englishAvg = avg ( s -> s.getEnglishScore() );
		System.out.println("영어 평균 점수: " + englishAvg);
		
		double mathAvg = avg ( s -> s.getMathScore() );
		System.out.println("수학 평균 점수: " + mathAvg);
		
		//exam07
		System.out.println("-----------------");
		englishAvg = avg ( Student :: getEnglishScore );
		System.out.println("영어 평균 점수: " + englishAvg);
		
		mathAvg = avg ( Student :: getMathScore );
		System.out.println("수학 평균 점수: " + mathAvg);
		
		
	}
	
	public static class Student {
		private String name;
		private int englishScore;
		private int mathScore;
		
		public Student() {
		}
		
		public Student(String name, int englishScore, int mathScore) {
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
		}

		public String getName() {
			return name;
		}

		public int getEnglishScore() {
			return englishScore;
		}

		public int getMathScore() {
			return mathScore;
		}	
	}

}


