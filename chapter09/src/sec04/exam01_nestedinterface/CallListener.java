package sec04.exam01_nestedinterface;

public class CallListener implements Button.OnClickListner{

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}

}
