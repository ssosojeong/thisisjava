package sec04.exam01_objects;

public class ExitExample {

	public static void main(String[] args) {
		
		//security manager 사용
		//i가 5일 때 종료되도록 checkExit 재정의
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) {
				//i가 5가 아니면 예외를 발생시켜서 Exit가 실행되지 않도록 함
				if(status!=5) {
					throw new SecurityException();
				}
			}
			
		});
		
		//실제 사용
		for(int i=0; i<10; i++) {
			System.out.println(i);
			
			//SecurityException 무시하고 for문 실행하도록
			try { System.exit(i); }  
			catch(SecurityException e) {} 
		}
		
		
	}

}
