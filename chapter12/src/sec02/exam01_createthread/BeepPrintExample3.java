package sec02.exam01_createthread;

import java.awt.*;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		//how1 - 직접 Thread 하위 클래스 만들어서 Thread 객체 생성
		//Thread thread = new BeepThread();
		
		//how2 - 익명 객체로 Thread 하위 클래스 만들기
		Thread thread = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
				}
			}
		};
		
		thread.start();
		
		//띵 문자열을 5번 출력하는 작업
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}

	}

}
