package sec4;

public class InputDataCheckNaNExample1 {

	public static void main(String[] args) {
		//유저에게서 실수값을 입력받는 경우 만약 유저가 NaN을 입력하면 
		String userInput = "NaN"; 
		//해당 string을 double로 변환하면 그게 NaN 값으로 변환됨 
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		//val이 NaN으로 인식된 상태에서 연산이 발생하면 
		currentBalance += val; 
		//그 결과는 무조건 NaN -> 문제 발생 
		System.out.println(currentBalance); 

	}

}
