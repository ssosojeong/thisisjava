package sec6;

public class AdvancedForExample {

	public static void main(String[] args) {
		// for문의 반복 조건을 배열을 이용해 주는 향상된 for문
		
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		//for(배열에서 꺼낸 항목을 저장할 변수 : 배열) {}
		for(int score : scores) {
			sum = sum + score;
		}
		System.out.println("점수 총합 : " + sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("점수 평균 : " + avg);
	}

}
