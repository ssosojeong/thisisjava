package sec4;

public class AccuracyExample2 {

	public static void main(String[] args) {
		int apple = 1;
		
		int totalPieces = apple * 10; //정수로 만들어줌 
		int number = 7;
		int temp = totalPieces - number;
		
		double result = temp/10.0; //값을 실수형으로 돌려주기 위해 10.0으로 나눔 
		
		System.out.println("사과 한개에서 ");
		System.out.println("0.7 조각을 빼면, ");
		System.out.println(result + "조각이 남는다.");
	}

}
