package sec6;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		} //scores.length = 3 (i 시작이 0이기 때문에 인덱스 0,1,2 셋만큼 돌아감)
		System.out.println("총합 : " + sum);
		
		double avg = (double)sum / scores.length; //결과를 double로 뽑기 위해 sum을 강제 타입 변환
		System.out.println("평균 : " + avg);
		

	}

}
