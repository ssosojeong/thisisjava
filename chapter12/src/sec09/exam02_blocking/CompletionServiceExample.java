package sec09.exam02_blocking;

import java.util.concurrent.*;

public class CompletionServiceExample {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors());
		
		CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(executorService);
		
		//for문 이용하여 3번 작업 요청
		//이 때 submit 매개변수로 callable에 대한 익명 구현 객체를 바로 만들어서 줘버림
		System.out.println("[작업 처리 요청]");
		for(int i=1; i<=3; i++) {
			completionService.submit(new Callable<Integer>(){
				@Override
				public Integer call() throws Exception {
					int sum = 0;
					for(int i=1; i<=10; i++) {
						sum += i;
					}
					return sum;
				}
			});
		}
		
		System.out.println("[처리 완료 작업 확인]");
		executorService.submit(new Runnable() {
			@Override
			public void run() {
				while(true) {
					try {
						Future<Integer> future = completionService.take();
						int value = future.get();
						System.out.println("[처리 결과] " + value);
					} catch (Exception e) {
						break;
					}	
				}
			}});
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) { }
		
		executorService.shutdown();
		
	}

}
