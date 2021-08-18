package verify.exam05;

import java.util.function.*;

public class LambdaExample {
	private static int[] scores = {10, 50, 3};
	
	public static int maxOrMin(IntBinaryOperator operator){
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(score, result);
		}
		return result;
	}
	
	public static void main(String[] args) {
		//최대값 얻기
		int max = maxOrMin(
				(score, result) -> {
					if(score>=result) { return score; } 
					else { return result; } }
		);
		System.out.println("최대값: " + max);
		
		//최소값 얻기
		int min = maxOrMin(
				(score, result) -> {
					if(score<=result) { return score; }
					else { return result; } }
				
		);
		System.out.println("최소값: " + min);
	}
	
}
