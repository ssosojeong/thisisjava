package sec09.exam02_blocking;

import java.util.concurrent.*;

public class ResultByRunnableExample {

	public static void main(String[] args) {
		//현재 컴퓨터의 코어 수 만큼의 최대 개수를 가진 스레드 풀 생성
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
		);
				
		System.out.println("[작업 처리 요청]");
		
		//Runnable 객체 만드는 클래스를 중첩 클래스로 선언
		class Task implements Runnable{
			Result result;
			
			Task(Result result){
				this.result = result;
			}
			
			@Override
			public void run() {
				int sum = 0;
				for(int i=1; i<=10; i++) {
					sum += i;
				}
				result.addValue(sum);
			}
			
		};
		
		//공유 객체(외부 객체)
		Result result = new Result();
		
		//두 개의 작업을 정의
		Runnable task1 = new Task(result);
		Runnable task2 = new Task(result);
		
		Future<Result> future1 = executorService.submit(task1, result);
		Future<Result> future2 = executorService.submit(task2, result);
		
		try {
			result = future1.get();
			result = future2.get();
			System.out.println("[처리 결과] " + result.accumValue);
			System.out.println("[작업 처리 완료]");
		} catch (Exception e) {
			System.out.println("[실행 예외 발생함] " + e.getMessage());
		}
		
	}

}

class Result{
	int accumValue;
	synchronized void addValue(int value) {
		accumValue += value;
	}
}
