package sec09.exam01_excute_submit;

import java.util.concurrent.*;

public class ExecuteVsSubmitExample {

	public static void main(String[] args) throws InterruptedException {
		//스레드 풀 생성
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		
		for(int i=0; i<10; i++) {
			//Runnable 작업 생성 
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)executorService;
					int poolSize = threadPoolExecutor.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("[총 스레드 개수: " + poolSize + "] 작업 스레드 이름: " + threadName);
					//일부러 예외 발생
					int value = Integer.parseInt("삼");
				}
			};
			//큐에 넣기(작업 처리 요청)
			//executorService.execute(runnable);
			executorService.submit(runnable);
			Thread.sleep(10);
		}
		
		//스레드 풀 종료
		executorService.shutdown();

	}

}
