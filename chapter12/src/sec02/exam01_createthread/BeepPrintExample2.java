package sec02.exam01_createthread;

import java.awt.*;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		//how1 - 따로 Runnable 구현 클래스 만들어버리기
		/*Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		*/
		
		//how2 - thread 객체 생성 시 Runnable의 익명 구현 객체 사용
		/*Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
				}
			}
		});
		*/
		
		//how3 - 람다식으로 thread 객체 생성
		Thread thread = new Thread ( () -> {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
			}
		});
		
		thread.start();
		
		//띵 문자열을 5번 출력하는 작업
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}

	}

}
