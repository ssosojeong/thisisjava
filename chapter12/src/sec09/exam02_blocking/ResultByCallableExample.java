package sec09.exam02_blocking;

import java.util.concurrent.*;

public class ResultByCallableExample {

	public static void main(String[] args) {
		//현재 컴퓨터의 코어 수 만큼의 최대 개수를 가진 스레드 풀 생성
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
		);
		
		System.out.println("[작업 처리 요청]");
		
		//return이 없는 runnable 작업 생성
		Callable<Integer> task = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for(int i=1; i<=10; i++) {sum += i;}
				return sum;
			}
		};
		
		//작업 큐에 넣기
		Future<Integer> future = executorService.submit(task);
		
		//작업 결과 알아보기
		try {
			int sum = future.get();
			System.out.println("[처리 결과] " + sum);
			System.out.println("[작업 처리 완료]");
		} catch (Exception e) { 
			System.out.println("[실행 예외 발생함] " + e.getMessage());
		}
		
		//작업 종료
		executorService.shutdown();
		
		

	}

}
