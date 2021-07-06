package sec02_runtime_execption;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		
		//예외 처리를 위해 args의 길이가 2가 아니면 사용 방법을 다시 알려줌
		if(args.length == 2) {
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0]: " + data1);
		System.out.println("args[1]: " + data2);
		} else {
			System.out.println("[실행 방법]");
			System.out.print("java ArrayIndexOutOfBoundsExceptionExample");
			System.out.println(" 값1 값2");
		}
	}

}
