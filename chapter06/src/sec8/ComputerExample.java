package sec8;

public class ComputerExample {

	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		//1. values1 배열을 먼저 생성한 뒤 매개변수로 주기 
		int[] values1 = {1,2,3};
		int result1 = myCom.sum1(values1);
		System.out.println("result1: " + result1);
		
		//2. 매개변수를 줌과 동시에 배열을 생성하기 
		int result2 = myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println("result2: " + result2);
		
		//3. ...로 생성했으니 그냥 값 리스트를 인수로 넘기기
		int result3 = myCom.sum2(1,2,3);
		System.out.println("result3: " + result3);
		
		int result4 = myCom.sum2(1,2,3,4,5);
		System.out.println("result4: " + result4);

	}

}
