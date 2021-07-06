package sec09.exam02_blocking;

import java.util.concurrent.*;

public class NoResultExample {

	public static void main(String[] args) {
		//현재 컴퓨터의 코어 수 만큼의 최대 개수를 가진 스레드 풀 생성
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
		);
		
		System.out.println("[작업 처리 요청]");
		
		//return이 없는 runnable 작업 생성
		Runnable runnable = new Runnable() {
			public void run() {
				int sum = 0;
				for(int i=1; i<=10; i++) {sum += i;}
				System.out.println("[처리 결과] " + sum);
			}
		};
		
		//작업 큐에 넣기
		Future future = executorService.submit(runnable);
		
		//작업 결과 알아보기
		try {
			future.get();
			System.out.println("[작업 처리 완료]");
		} catch (Exception e) { 
			System.out.println("[실행 예외 발생함] " + e.getMessage());
		}
		
		//작업 종료
		executorService.shutdown();
		
		

	}

}
