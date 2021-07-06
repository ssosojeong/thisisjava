package sec6;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		
		//만약 프로그램 실행 시 입력된 데이터 개수가 두 개가 아닐 경우 
		if(args.length != 2) { 
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0); //프로그램 강제 종료
		}
		
		//매개변수로 들어온 두 스트링 인자를 string 변수에 저장 
		String strNum1 = args[0];
		String strNum2 = args[1]; 
		
		//각 문자열을 정수로 바꿔서 저장함 
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		
		//이클립스에서 프로그램 실행 시 매개값을 주고 실행하려면
		//메뉴에서 run -> run configurations 선택하고 
		//argument 선택 후 입력하고 run 하면 됨
	}

}
