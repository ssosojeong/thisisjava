package sec05_try_with_resources;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("file.txt")){
			fis.read();
			
			//예외를 강제적으로 발생시키는 코드
			//예외 발생 시 즉시 fis.close() 호출됨 
			throw new Exception();
			
			//예외발생 안되면 try 마지막에서 fis.close(); 자동적으로 호출 
		} catch(Exception e) {
			 System.out.println("예외 처리 코드가  실행되었습니다.");
		}

	}

}
