package sec02_runtime_execption;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);
		//a100은 int로 바꿀 수 없어 예외 발생
		//int value2 = Integer.parseInt(data2);

	}

}
