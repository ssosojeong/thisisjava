package sec05.exam05_operator;

import java.util.function.*;

public class OperatorExample {
	private static int[] scores = { 92, 95, 87 };
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;	
	}
	
	
	public static void main(String[] args) {
		//max 구하기
		int max = maxOrMin((result, score) -> {
			if(result >= score) {
				return result;
			} else {
				return score;
			}
		});
		
		System.out.println("최대값: " + max);
	
		//min 구하기
		int min = maxOrMin((result, score) -> {
			if(result <= score) {
				return result;
			} else {
				return score;
			}
		});

		System.out.println("최소값: " + min);
			
		
	}

}
