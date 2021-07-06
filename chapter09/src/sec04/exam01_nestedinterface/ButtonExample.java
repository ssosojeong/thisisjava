package sec04.exam01_nestedinterface;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListner(new CallListener());
		btn.touch();
		
		btn.setOnClickListner(new MessageListener());
		btn.touch();
		
		//익명 구현 객체 사용
		btn.setOnClickListner(new Button.OnClickListner() {
			@Override
			public void onClick() {
				System.out.println("사진을 찍습니다.");
			}
		});
		btn.touch();

	}

}
