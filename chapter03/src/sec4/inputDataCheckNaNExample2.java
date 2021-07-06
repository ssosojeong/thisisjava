package sec4;

public class inputDataCheckNaNExample2 {

	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		//if문과 Double.isNaN()을 이용해서 NaN값을 처리해줌 
		if(Double.isNaN(val)) {
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val = 0.0; 
		}
		
		//val이 0.0으로 초기화되었으므로 currentBalance는 그대로 
		currentBalance += val;
		System.out.println(currentBalance);

	}

}
