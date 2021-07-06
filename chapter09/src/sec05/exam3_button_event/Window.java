package sec05.exam3_button_event;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	//이벤트 처리를 위해 익명 구현 객체를 필드로 선언
	Button.OnClickListner listener = new Button.OnClickListner() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");	
		}
	};
	
	Window(){
		
		//윈도우 창에서 버튼1이 터치되었을 경우의 이벤트 처리
		button1.setOnClickListner(listener);
		
		//윈도우 창에서 버튼2가 터치되었을 경우의 이벤트 처리
		//매개변수로 익명 구현 객체 활용
		button2.setOnClickListner(new Button.OnClickListner() {
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");	
			}
		});
		
	}

}
