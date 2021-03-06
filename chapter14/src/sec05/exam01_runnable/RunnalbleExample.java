package sec05.exam01_runnable;

public class RunnalbleExample {

	public static void main(String[] args) {
		
/*		Runnable runnable = () -> {
*			for(int i=0; i<10; i++) {
*				System.out.println(i);
*			}
*		};
*		
*		Thread thread = new Thread(runnable);
*		thread.start();
*/

		//주로 이 방법 사용
		Thread thread = new Thread(() -> {
			for(int i=0; i<10; i++) {
				System.out.println(i);
			}
		});
		thread.start();

	}

}
