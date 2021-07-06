package sec04.exam01_nestedinterface;

public class MessageListener implements Button.OnClickListner{

	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다.");
	}

}
