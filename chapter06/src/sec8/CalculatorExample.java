package sec8;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator(); 	//calculator 객체 생성
		myCalc.powerOn();						//myCal의 메소드 호출 
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1: " + result1);
		
		//divide는 인수를 int로 받는다고 명시했지만, byte는 int로 자동타입변환 가능하기 때문에 byte를 넣어도 무방 
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x,y);
		System.out.println("result2: " + result2);
		
		myCalc.powerOff();

	}

}
